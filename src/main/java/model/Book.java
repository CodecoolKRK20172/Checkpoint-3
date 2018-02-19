package model;

public class Book extends TypeBook {

    private int ISBN;
    private int author;
    private String title;
    private String publisher;
    private int publicationYear;
    private int price;

    public Book(String type, int typeID, int ISBN, int author, String title, String publisher, int publicationYear, int price) {
        super(type, typeID);
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public Book(int author, String title, String publisher, int publicationYear, int price, String type) {
        super(type);
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getISBN() { return ISBN; }
    public int getAuthor() { return author; }
    public String getTitle() { return title; }
    public String getPublisher() { return publisher; }
    public int getPublicationYear() { return publicationYear; }
    public int getPrice() { return price; }
    public String getType() { return type; }
}
