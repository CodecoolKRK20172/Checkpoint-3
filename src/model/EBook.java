package model;

public class EBook extends Book{

    private final String TYPE = "E-Book";

    public EBook(int ISBN, int authorId, String title, String publisher, int publicationYear, int price) {
        super(ISBN, authorId, title, publisher, publicationYear, price);
    }
}
