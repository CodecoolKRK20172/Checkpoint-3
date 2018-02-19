package model;

public class PrintedBook extends Book{
    private final String TYPE = "Printed book";

    public PrintedBook(int ISBN, int authorId, String title, String publisher, int publicationYear, int price) {
        super(ISBN, authorId, title, publisher, publicationYear, price);
    }
}
