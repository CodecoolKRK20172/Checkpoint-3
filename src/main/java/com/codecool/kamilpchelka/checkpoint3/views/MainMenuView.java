package com.codecool.kamilpchelka.checkpoint3.views;

import com.codecool.kamilpchelka.checkpoint3.models.Author;
import com.codecool.kamilpchelka.checkpoint3.models.Book;
import com.codecool.kamilpchelka.checkpoint3.models.Publisher;
import com.codecool.kamilpchelka.checkpoint3.models.TypeBook;
import com.codecool.kamilpchelka.checkpoint3.utils.Colors;

import java.util.Arrays;
import java.util.List;

public class MainMenuView extends AbstractView {

    private static final List<String> MAIN_MENU = Arrays.asList("Welcome Jerzy !",
            "(1) Add new book",
            "(2) Edit book",
            "(3) Delete book",
            "(4) Search foor book by given parameter",
            "(5) Books available in library sorted ascending by name",
            "(6) See all books written by given author");


    public void printMainMenu() {
        clearConsole();
        MAIN_MENU.forEach(System.out::println);
    }

    public void showErrorMsg() {
        clearConsole();
        System.out.print(Colors.RED);
        System.out.println("Your input is incorrect or there is a problem with database !");
        getUserInput();

    }

    public void printPublishers(List<Publisher> publishers) {
        clearConsole();
        System.out.println("Publishers: ");
        publishers.forEach(System.out::println);
    }

    public void printBooks(List<Book> books) {
        clearConsole();
        System.out.println("Books: ");
        books.forEach(System.out::println);
    }

    public void printAuthors(List<Author> authors) {
        clearConsole();
        System.out.println("Authors: ");
        authors.forEach(System.out::println);
    }

    public void printTypeBooks(List<TypeBook> typebooks) {
        clearConsole();
        System.out.println("Books types: ");
        typebooks.forEach(System.out::println);
    }

    public void showNewbookAddedSuccesfully() {
        clearConsole();
        System.out.println("New book have been added successfully");
        getUserInput();
    }

    public void bookDeletedMsg() {
        clearConsole();
        System.out.println("Book have been deleted successfully");
        getUserInput();
    }
}