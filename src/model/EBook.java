package model;

public class EBook extends Book{

    private final String TYPE = "E-Book";

    public EBook(int ISBN, String author, String title, String publisher, int publicationYear, int price) {
        super(ISBN, author, title, publisher, publicationYear, price);
    }
}
