package services;

import java.util.Scanner;

public class InputGetter {

    private static Scanner scanner = new Scanner(System.in);

    public static String getStringInput(String message) {
        boolean incorrectInput = true;
        String userInput = "";

        while (incorrectInput) {
            System.out.println(message);
            userInput = scanner.nextLine();

            if (userInput != null) incorrectInput = false;
        }
        return userInput;
    }

    public static Integer getIntegerInput(String message) {
        boolean incorrectInput = true;
        Integer userInput = null;

        while(incorrectInput) {
            System.out.println(message);
            userInput = scanner.nextInt();

            if(userInput != null) incorrectInput = false;
        }
        return userInput;
    }

    public static String promptUserToPressEnter() {
        System.out.println("\nPress enter to continue...");
        return scanner.nextLine();
    }
}