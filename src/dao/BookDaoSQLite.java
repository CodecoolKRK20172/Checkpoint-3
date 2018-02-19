package dao;

import model.Book;
import model.EBook;
import model.PrintedBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoSQLite {

    private Connection connection;

    public BookDaoSQLite() {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        connection = dbConnection.getConnection();
    }

    private List<Book> fillBooksList(ResultSet resultSet) throws SQLException {

        List<Book> books = new ArrayList<>();

        //int ISBN, String author, String title, String publisher, int publicationYear, int price)

        while (resultSet.next()) {
            int ISBN = resultSet.getInt("ISBN");
            int authorId = resultSet.getInt("author");
            String title = resultSet.getString("title");
            String publisher = resultSet.getString("publisher");
            int publicationYear = resultSet.getInt("publication_year");
            int price = resultSet.getInt("price");
            int typeId = resultSet.getInt("type");

            //1- EBook
            //2- PrintedBook
            //make it shorter if there is time
            if(typeId == 1) {
                EBook newEbook = new EBook(ISBN, authorId,title,publisher,publicationYear,price);
                books.add(newEbook);
            } else {
                PrintedBook newPrintedBook = new PrintedBook(ISBN, authorId, title, publisher, publicationYear, price);
                books.add(newPrintedBook);
                }
            }
        return books;
        }

        public List<Book> selectAllBooks() throws SQLException {

            PreparedStatement preparedSelect = connection.prepareStatement("SELECT * FROM Books");
            ResultSet resultSet = preparedSelect.executeQuery();

            return fillBooksList(resultSet);
        }



}
