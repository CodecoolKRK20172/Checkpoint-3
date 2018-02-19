package controller;

import dao.BookDao;
import dao.BookDaoSQLite;
import model.Book;
import view.BaseView;

import java.sql.SQLException;

public class BookController {

    private BaseView view = new BaseView();
    private BookDao dao = new BookDaoSQLite();

    void showBooks() {
        try {
            for (Book book : dao.selectAllBooks()) {
                view.printMsg(book.getFullBookInfo());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void insertBook() {
        Book bookToAdd = view.getBookInput();
        int result =0;
        try {
            result = dao.insertBook(bookToAdd);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String status = result > 0 ? "Book inserted" : "Book not inserted" ;
        view.printMsg(status);
    }
}
