import java.util.Scanner;

public class PrintCalendar {

    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        // Prompt the user to enter a month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for the month of the year
        printMonth(year, month);
    }

    /** A stub for printMonth may look like this */
    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    /** A stub for printMonthTitle may look like this */
    public static void printMonthTitle(int year, int month) {
        String monthName = getMonthName(month);
        System.out.println(monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    /** A stub for printMonthBody may look like this */
    public static void printMonthBody(int year, int month) {

        int startDay = getStartDay(year, month);
        int daysInMonth = getNumberOfDaysInMonth(year, month);

        // print starting spaces
        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        // print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // new line every Sunday
            if ((day + startDay - 1) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    /** A stub for getMonthName may look like this */
    public static String getMonthName(int month) {
        String name = "";
        switch (month) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name = "July";
                break;
            case 8:
                name = "August";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;
        }
        return name;
    }

    /** A stub for getStartDay may look like this */
    public static int getStartDay(int year, int month) {
        int m = month;
        int y = year;

        if (m == 1) {
            m = 13;
            y--;
        }
        if (m == 2) {
            m = 14;
            y--;
        }

        int q = 1; 
        int K = y % 100; 
        int J = y / 100; 

        int h = (q + (26 * (m + 1)) / 10 + K + K / 4 + J / 4 + 5 * J) % 7;

        // convert Zeller output to: Mon=1 ... Sun=7
        int weekday;
        switch (h) {
            case 0:
                weekday = 7;
                break;
            case 1:
                weekday = 1;
                break;
            case 2:
                weekday = 2;
                break;
            case 3:
                weekday = 3;
                break;
            case 4:
                weekday = 4;
                break;
            case 5:
                weekday = 5;
                break;
            case 6:
                weekday = 6;
                break;
            default:
                weekday = 1;
        }
        return weekday;
    }

    /** A stub for getNumberOfDaysInMonth may look like this */
    public static int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
        }
        return 0;
    }

    /** A stub for isLeapYear may look like this */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 &&
                (year % 100 != 0 || year % 400 == 0));
    }

}