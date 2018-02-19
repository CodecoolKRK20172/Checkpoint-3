package view;

import model.Author;
import services.InputGetter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static services.InputGetter.getIntegerInput;
import static services.InputGetter.getStringInput;

public class menuView extends View{
    private Map<String, String> mainMenu = new HashMap<String, String>();

    public void handleMainMenu() {
        clearScreen();
        prepareMainMenu();
        displayMainMenu();
    }

    private void prepareMainMenu() {
        mainMenu.put("1. ", "List books.");
        mainMenu.put("2. ", "Add new book.");
        mainMenu.put("3. ", "Remove a book from collection.");
        mainMenu.put("4. ", "Search for a book.");
        mainMenu.put("5. ", "Save this address book.");
        mainMenu.put("6. ", "Show books by given author.");
    }

    private void displayMainMenu() {
        for (String element : mainMenu.keySet()) {
            System.out.println(element + mainMenu.get(element));
        }
        System.out.println("0. Back to main menu.");
    }

    public int askForMenuOption() {
        return InputGetter.getIntegerInput("What would you like to do?\n");
    }

    public void displayBooksInCollection(List<String> books) {
        System.out.println("Books collection: ");

        for (String title : books) {
            System.out.println("Title: " + title);
        }
    }

    public String askForAuthorName() { return InputGetter.getStringInput("Enter author name: "); }
    public String askForTitle() { return InputGetter.getStringInput("Enter title: "); }
    public String askForPublisher() { return InputGetter.getStringInput("Enter publisher: ");}
    public int askForPublicationYear() { return InputGetter.getIntegerInput("Enter year of publication: "); }
    public int askForPrice() { return InputGetter.getIntegerInput("Enter price: "); }
    public String askForType() { return InputGetter.getStringInput("What type is this book?"); }


    public void displayAuthors(List<Author> authors) {
        for (Author person : authors) {
            System.out.println(person.toString());
        }
    }

    public int askForAuthor() { return InputGetter.getIntegerInput("Enter id of author you want to choose: "); }
}
