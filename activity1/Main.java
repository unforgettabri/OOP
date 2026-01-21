package activity1;

public class Main{
    public static void main(String[] args) {
        //create two objects for main method 
        Book book1 = new Book("Death on the Nile", "Agatha Christie", 9780062573230l, "November 1, 1937");
        Book book2 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 9780439708180l,"July 8, 1999");

        //print book information
        book1.printBookInfo();  
        System.out.println(); //for spaces
        book2.printBookInfo();

        //initialize all fields with your favorite books
        Book favBook1 = new Book();
        System.out.println(); //for spaces
        favBook1.printBookInfo();

        Book favBook2 = new Book();
        System.out.println(); //for spaces
        favBook2.printBookInfo();

    }
}