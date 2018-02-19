package controller;

import dao.AuthorDAO;
import dao.BookDAO;
import dao.DbAuthorDAO;
import dao.DbBookDAO;
import model.Author;
import model.Book;
import view.menuView;

import java.util.List;

public class mainController {
    private menuView view = new menuView();
    private BookDAO booksDAO = new DbBookDAO();

    public void runMainMenu() {
        boolean isExit = false;

        while(!isExit) {
            view.handleMainMenu();

            switch(view.askForMenuOption()) {

                case 1 :
                    List<String> books = booksDAO.getAllBookTitles();
                    view.displayBooksInCollection(books);
                    break;

                case 2 :
                    addNewBook();
                    break;

                case 3 :
                    break;

                case 4 :
                    break;

                case 5 :
                    break;

                case 6 :
                    break;

                case 0 :
                    isExit = true;
                    break;
            }
        }
    }

    private void addNewBook() {
        Book book = createBook();
        booksDAO.add(book);
    }

    private Book createBook() {
        return new Book(
                pickAuthor().getId(),
                view.askForTitle(),
                view.askForPublisher(),
                view.askForPublicationYear(),
                view.askForPrice(),
                view.askForType()
        );
    }

    private int chooseAuthorID(List<Author> authors) {
        view.displayAuthors(authors);
        return view.askForAuthor();
    }

    private Author pickAuthor() {
        AuthorDAO authorDAO = new DbAuthorDAO();
        List<Author> authors = authorDAO.getAuthors();

        view.displayAuthors(authors);
        int author_id = view.askForAuthor();

        for (Author person : authors) {
            if (person.getId() == author_id) return person;
        }
        return null;
    }
}
