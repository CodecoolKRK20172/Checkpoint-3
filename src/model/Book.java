package model;

public class Book {
    private int ISBN;
    private String author;
    private String title;
    private String publisher;
    private int publicationYear;
    private int price;

    public Book(int ISBN, String author, String title, String publisher, int publicationYear, int price) {
    this.ISBN = ISBN;
    this.author = author;
    this.title = title;
    this.publisher = publisher;
    this.publicationYear = publicationYear;
    this.price = price;
    }

    public String getFullBookInfo(){
        return String.format("%s: %s", author, title);
    }


    public int getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
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