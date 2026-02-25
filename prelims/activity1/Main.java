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

        Book book3 = new Book("Holy Scriptures NWT", "Watchtower Bible and Tract Society", 9780529084023l, "January 1, 2015");
        Book book4 = new Book ("The Alchemist", "Paulo Coelho", 9780061122415l, "May 1, 1993");

        //printing the output
        book1.printBookInfo();

        System.out.println(); //for spaces
        book2.printBookInfo();
        
        System.out.println(); //for spaces
        book3.printBookInfo();

        System.out.println(); //for spaces
        book4.printBookInfo();
    }
}