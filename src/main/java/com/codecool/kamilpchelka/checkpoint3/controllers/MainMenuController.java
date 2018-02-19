package com.codecool.kamilpchelka.checkpoint3.controllers;

import com.codecool.kamilpchelka.checkpoint3.database.AuthorsDAO;
import com.codecool.kamilpchelka.checkpoint3.database.BookTypesDAO;
import com.codecool.kamilpchelka.checkpoint3.database.BooksDAO;
import com.codecool.kamilpchelka.checkpoint3.database.PublishersDAO;
import com.codecool.kamilpchelka.checkpoint3.models.Author;
import com.codecool.kamilpchelka.checkpoint3.models.Book;
import com.codecool.kamilpchelka.checkpoint3.views.MainMenuView;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainMenuController {


    private MainMenuView mainMenuView;
    private BooksDAO booksDAO;
    private AuthorsDAO authorsDAO;
    private PublishersDAO publishersDAO;
    private BookTypesDAO bookTypesDAO;

    public MainMenuController(MainMenuView mainMenuView, BooksDAO booksDAO, AuthorsDAO authorsDAO, PublishersDAO publishersDAO, BookTypesDAO bookTypesDAO) {
        this.mainMenuView = mainMenuView;
        this.booksDAO = booksDAO;
        this.authorsDAO = authorsDAO;
        this.publishersDAO = publishersDAO;
        this.bookTypesDAO = bookTypesDAO;
    }

    public void init() {

        while (true) {
            try {
                mainMenuView.printMainMenu();
                String option = mainMenuView.getUserInput("Option: ");
                mainMenuView.clearConsole();
                processUserOptionInput(option);
            } catch (Exception e) {
                mainMenuView.showErrorMsg();
            }
        }

    }

    public void processUserOptionInput(String option) throws SQLException {

        switch (option) {
            case "1":
                runAddNewBookCreator();
                break;
            case "2":
                runExistingBookEditor();
                break;
            case "3":
                runDeleteBookProcess();
                break;
            case "5":
                runShowingBooksListByTheirNamesAscending();
                break;
            case "6":
                runShowingBooksListByGivenAuthor();
                break;
        }
    }

    private void runExistingBookEditor() {

    }

    private void runShowingBooksListByGivenAuthor() throws SQLException {

        List<Book> books = booksDAO.getAllBooks();

        List<Author> authors = authorsDAO.getAuthors();

        mainMenuView.printAuthors(authors);

        int authorID = Integer.parseInt(mainMenuView.getUserInput("Type author id: "));

        mainMenuView.printBooks(books.stream().filter(book -> book.getAuthor() == authorID).collect(Collectors.toList()));

        mainMenuView.getUserInput();
    }

    private void runShowingBooksListByTheirNamesAscending() throws SQLException {

        List<Book> books = booksDAO.getAllBooks();

        Collections.sort(books, (b1, b2) -> (b1.getTitle().compareTo(b2.getTitle())));

        mainMenuView.printBooks(books);
        mainMenuView.getUserInput();


    }

    private void runDeleteBookProcess() throws SQLException {
        mainMenuView.printBooks(booksDAO.getAllBooks());

        int isbn = Integer.parseInt(mainMenuView.getUserInput("Type ISBN of book you'd to delete: "));

        booksDAO.deleteBook(isbn);

        mainMenuView.bookDeletedMsg();
    }

    private void runAddNewBookCreator() throws SQLException {

        booksDAO.addOrUpdateBook(createBookObjectFromUserInput());

        mainMenuView.showNewbookAddedSuccesfully();
    }

    private Book createBookObjectFromUserInput() throws SQLException {
        int isbn = Integer.parseInt(mainMenuView.getUserInput("Type ISBN: "));

        mainMenuView.printAuthors(authorsDAO.getAuthors());

        int author = Integer.parseInt(mainMenuView.getUserInput("Type author ID: "));

        String title = mainMenuView.getUserInput("Type book title: ");

        mainMenuView.printPublishers(publishersDAO.getPublishers());

        String publisher = mainMenuView.getUserInput("Type publisher ID: ");

        int publicationYear = Integer.parseInt(mainMenuView.getUserInput("Type publication year: "));

        double price = Double.parseDouble(mainMenuView.getUserInput("Type book price: "));

        mainMenuView.printTypeBooks(bookTypesDAO.getTypeBooks());

        int type = Integer.parseInt(mainMenuView.getUserInput("Typy book id type: "));

        Book book = new Book(isbn, author, title, publisher, publicationYear, price, type);

        return book;
    }

}
