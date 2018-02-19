package controller;

import view.BaseView;

public class RootController {

    private BaseView view =new BaseView();
    private BookController bookController = new BookController();

    public void start () {

        String option = "";

        while (!option.equals("0")) {

            view.printMenu();
            option = view.getInput("Enter option: ");

            switch (option) {
                case "1":
                    bookController.showBooks();
                    break;
                case "2":
                    bookController.insertBook();
                    break;
                case "3":
                    bookController.showBooksByTitle();
            }
        }
    }
}
