package dao;

import model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {

    List<Book> selectAllBooks() throws SQLException;
    int insertBook(Book book) throws SQLException;

    }
