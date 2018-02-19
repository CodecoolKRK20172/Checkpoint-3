package dao;

import model.Book;

import java.util.List;

public interface BookDAO {
    List<String> getAllBookTitles();
    void add(Book book);
}
