package com.codecool.kamilpchelka.checkpoint3.views;

import com.codecool.kamilpchelka.checkpoint3.utils.Colors;

import java.util.Scanner;

public class AbstractView {


    static final String CLEAR_CONSOLE = "\033\143";

    private Scanner scanner;

    AbstractView() {
        scanner = new Scanner(System.in);
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void clearConsole() {
        System.out.println(CLEAR_CONSOLE);
    }
    public String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void continuePrompt() {
        System.out.print(Colors.PURPLE_BOLD);
        System.out.println("Hit enter to continue");
        getUserInput();
    }


}
