import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
                        float dep = sc.nextFloat();
                        account.deposit(dep);
                        System.out.println("Deposit successful.");
                        break;

                    case 3:
                        System.out.print("Enter withdraw amount: ");
                        float wd = sc.nextFloat();
                        if (account.withdraw(wd)) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;

                    case 0:
                        String message = "Thank you for using JAVA ATM!";
                        for (char c1 : message.toCharArray()) {
                            System.out.print(c1);
                            Thread.sleep(100); // Delay in milliseconds
                        }
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