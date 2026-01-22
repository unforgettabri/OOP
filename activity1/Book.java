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
    }

    void printBookInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("Publication Date: " + publicationDate);
    } 
}

//this.____
// - talks abt the object (not the parameter)