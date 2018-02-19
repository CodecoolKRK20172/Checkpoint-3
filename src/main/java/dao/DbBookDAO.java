package dao;

import dao.entry.BookEntry;
import dao.statements.sqlQueries;
import model.Book;

import java.sql.*;
import java.util.ArrayList;

import java.util.List;

public class DbBookDAO implements BookDAO {
    DBProcess process = new DBProcess();

    public List<String> getAllBookTitles() {
        List<String> bookTitles = new ArrayList<String>();
        String statement = sqlQueries.showBooks();

        try {
            ResultSet result = process.executeDisplay(statement);

            while (result.next()) {
                String title = result.getString(BookEntry.title.name());
                bookTitles.add(title);
            }
            result.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }

        return bookTitles;
    }

    public void add(Book book) {
        String statement = sqlQueries.add(book);
        process.executeUpdateDB(statement);
    }
}