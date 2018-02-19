package com.codecool.kamilpchelka.checkpoint3.models;

public class Book {


    private int isbn;
    private int author;
    private String title;
    private String publisher;
    private int publicationYear;
    private double price;
    private int type;

    public Book() {
    }

    public Book(int isbn, int author, String title, String publisher, int publicationYear, double price, int type) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %d, Title: %s, Publisher's id: %s, Publication Year: %d, Price: %f, Type id: %d",
                isbn, title, publisher, publicationYear, price, type);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
