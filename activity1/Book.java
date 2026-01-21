package activity1;

public class Book {
    // initializing
    String title;
    String author;
    long isbn;
    String publicationDate;

    public Book(String title, String author, long isbn, String publicationDate) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.publicationDate = publicationDate;
    }

    public Book() {
        this.title = "Holy Scriptures NWT";
        this.author = "Watchtower Bible and Tract Society";
        this.isbn = 9780529084023l;
        this.publicationDate = "January 1, 2015";

        // Object this2;
        // this2.title = "The Alchemist";   
        // this2.author = "Paulo Coelho";
        // this2.isbn = 9780061122415l;
        // this2.publicationDate = "May 1, 1993";
    }

    void printBookInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("Publication Date: " + publicationDate);
    } 
}