package com.codecool.kamilpchelka.checkpoint3.main;

import com.codecool.kamilpchelka.checkpoint3.controllers.MainMenuController;
import com.codecool.kamilpchelka.checkpoint3.database.AuthorsDAO;
import com.codecool.kamilpchelka.checkpoint3.database.BookTypesDAO;
import com.codecool.kamilpchelka.checkpoint3.database.BooksDAO;
import com.codecool.kamilpchelka.checkpoint3.database.PublishersDAO;
import com.codecool.kamilpchelka.checkpoint3.views.MainMenuView;

public class App {

    public static void main(String[] args) {

        MainMenuView mainMenuView = new MainMenuView();
        BooksDAO booksDAO = new BooksDAO();
        AuthorsDAO authorsDAO = new AuthorsDAO();
        PublishersDAO publishersDAO = new PublishersDAO();
        BookTypesDAO bookTypesDAO = new BookTypesDAO();

        MainMenuController mainMenuController = new MainMenuController(mainMenuView, booksDAO, authorsDAO, publishersDAO, bookTypesDAO);

        mainMenuController.init();
    }
}
