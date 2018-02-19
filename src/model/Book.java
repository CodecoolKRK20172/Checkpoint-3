package model;

public class Book {
    private int ISBN;
    private int authorId;
    private String title;
    private String publisher;
    private int publicationYear;
    private int price;

    public Book(int ISBN, int authorId, String title, String publisher, int publicationYear, int price) {
    this.ISBN = ISBN;
    this.authorId = authorId;
    this.title = title;
    this.publisher = publisher;
    this.publicationYear = publicationYear;
    this.price = price;
    }

    public String getFullBookInfo(){
        return String.format("%s: %d", title, authorId);
    }


    public int getISBN() {
        return ISBN;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPrice() {
        return price;
    }
}