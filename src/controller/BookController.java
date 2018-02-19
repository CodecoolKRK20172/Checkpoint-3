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
}
