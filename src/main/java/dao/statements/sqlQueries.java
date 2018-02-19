package dao.statements;

import dao.entry.AuthorEntry;
import dao.entry.BookEntry;
import model.Author;
import model.Book;

public class sqlQueries {

    public static String add(Book book) {
        return "INSERT INTO " + BookEntry.Books.name() + " ( " +
                BookEntry.ISBN.name() + ", " +
                BookEntry.author.name() + ", " +
                BookEntry.title.name() + ", " +
                BookEntry.publisher.name() + ", " +
                BookEntry.publication_year.name() + ", " +
                BookEntry.price.name() + ", " +
                BookEntry.type.name() + ") " +
                "VALUES (" +
                book.getISBN() + ", " +
                book.getAuthor() + ", " +
                book.getTitle() + ", " +
                book.getPublisher() + ", " +
                book.getPublicationYear() + ", " +
                book.getPrice() + ", " +
                book.getType() + ");";
    }

    public static String showBooks() {
        return "SELECT " + BookEntry.title.name() + " FROM " + BookEntry.Books.name() + "; ";
    }

    public static String getAuthors() {
        return "SELECT * " + " FROM " + AuthorEntry.Authors.name() + "; ";
    }
}
