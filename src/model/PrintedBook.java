package model;

public class PrintedBook extends Book{
    private final String TYPE = "Printed book";

    public PrintedBook(int ISBN, String author, String title, String publisher, int publicationYear, int price) {
        super(ISBN, author, title, publisher, publicationYear, price);
    }
}
