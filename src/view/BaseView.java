package view;

import model.Book;

import java.util.Scanner;

public class BaseView {

    public void printMenu() {
        System.out.println();
        System.out.println("(1) List all the books\n"
                + "(2) Add a new book\n"
                + "(0) Exit");
        System.out.println();
    }

    public String getInput(String msg) {
        System.out.println();
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println();
        return input;
    }

    public void printMsg(String msg) {
        System.out.println(msg);
    }

    //public Book getBookInput(){}
}
