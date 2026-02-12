import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // load accounts
        // BankAccount[] accounts;
        ArrayList<BankAccount> accounts = new ArrayList<>();
        loadAccounts(accounts);

        // login
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JAVA ATM");
        System.out.println("Enter account number to proceed:");
        String acctNo = sc.nextLine();
        System.out.println("Enter PIN:");
        int pin = sc.nextInt();

        // CHECKING IF THE ACCOUNT IS PRESENT THEN AUTHENTICATE WITH THE PIN

        Optional<BankAccount> newSessionUser = accounts.stream().filter(b -> b.getAcctNo().equals(acctNo)).findFirst();

        if (newSessionUser.isPresent()) {
            if (newSessionUser.get().isValidPin(pin)) {
                System.out.println("Welcome...");
                // begin transaction
                beginTransaction(newSessionUser.get());
            } else {
                System.out.println("Invalid credentials...");
            }
        } else {
            String message = "User not present. . .";
            for (char c : message.toCharArray()) {
                System.out.print(c);
                Thread.sleep(100); // Delay in milliseconds
            }
            System.out.println(); // New line at the end
        }

    }

    public static void beginTransaction(BankAccount account) {
        Scanner sc = new Scanner(System.in);
        int c;

        do {
            System.out.println("""
                        Menu
                        1. Balance Inquiry
                        2. Deposit
                        3. Withdraw
                        0. Exit
                    """);
            System.out.print("Choice: ");

            try {
                c = sc.nextInt();

                switch (c) {
                    case 1:
                        System.out.println("Current Balance: " + account.getBalance());
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        if (account.deposit(sc.nextFloat())) {
                            System.out.println("Deposit successful.");
                            System.out.println("New Balance: " + account.getBalance());
                        } else {
                            System.out.println("Invalid deposit amount.");
                        }
                        break;
                
                    case 3:
                        System.out.print("Enter withdraw amount: ");
                        if (account.withdraw(sc.nextFloat())) {
                            System.out.println("Withdrawal successful.");
                            System.out.println("New Balance: " + account.getBalance());
                        } else {
                            System.out.println("Transaction failed. Check balance or amount.");
                        }
                        break;


                    case 0:
                        exitSave(account);
                        System.out.println(); // New line at the end
                        break;
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Numbers only.");
                sc.nextLine(); // clear input buffer
                c = -1;
            }

        } while (c != 0);
    }

    public static void exitSave(BankAccount updatedAccount) {

        ArrayList<BankAccount> accounts = new ArrayList<>();
        loadAccounts(accounts);

        // Update the modified account in the list
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAcctNo().equals(updatedAccount.getAcctNo())) {
                accounts.set(i, updatedAccount);
                break;
            }
        }

        // Save back to accounts.csv
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.csv"))) {

            // Write header
            writer.write("Account No.,Name,Balance,Pin");
            writer.newLine();

            // Write updated data
            for (BankAccount acc : accounts) {
                writer.write(acc.getAcctNo() + "," + acc.getFullName() + "," + acc.getBalance() + "," + acc.getPin());
                writer.newLine();
            }

            String message = "Accounts successfully saved to accounts.csv";
            for (char c : message.toCharArray()) {
                System.out.print(c);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            System.out.println("Error saving accounts.");
            e.printStackTrace();
        }

        System.out.println(); // basta ppng space
        String message = "Program Terminated.";
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.exit(0);
    }

    public boolean deposit(float amount) {
    if (amount <= 0) {
        return false;
    }
    balance += amount;
    return true;
    }

    public boolean withdraw(float amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public static void loadAccounts(ArrayList<BankAccount> accounts) {
        try (Scanner reader = new Scanner(new File("accounts.csv"))) {
            reader.nextLine(); // skip the header
            while (reader.hasNextLine()) {
                String[] cols = reader.nextLine().split(",");
                String acctNo = cols[0];
                String fullName = cols[1];
                float balance = Float.parseFloat(cols[2]);
                int pin = Integer.parseInt(cols[3]);

                BankAccount acc = new BankAccount(acctNo, pin, balance, fullName);
                accounts.add(acc);
            }
        } catch (FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
