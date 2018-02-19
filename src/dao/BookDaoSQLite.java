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

public class BookDaoSQLite implements BookDao{

    private Connection connection;

    public BookDaoSQLite() {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        connection = dbConnection.getConnection();
    }

    private List<Book> fillBooksList(ResultSet resultSet) throws SQLException {

        List<Book> books = new ArrayList<>();

        while (resultSet.next()) {
            int ISBN = resultSet.getInt("ISBN");
            int authorId = resultSet.getInt("author");
            String title = resultSet.getString("title");
            String publisher = resultSet.getString("publisher");
            int publicationYear = resultSet.getInt("publication_year");
            int price = resultSet.getInt("price");
            int typeId = resultSet.getInt("type");


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

            PreparedStatement preparedSelect = connection.prepareStatement("SELECT * FROM Books ORDER BY title ASC ");
            ResultSet resultSet = preparedSelect.executeQuery();

            return fillBooksList(resultSet);
        }

        public int insertBook(Book book) throws SQLException {
        PreparedStatement preparedInsert = connection.prepareStatement("INSERT INTO Books(ISBN, author, title, publisher, publication_year, price) VALUES (?,?,?,?,?,?)");

        preparedInsert.setInt(1, book.getISBN());
        preparedInsert.setInt(2,book.getAuthorId());
        preparedInsert.setString(3, book.getTitle());
        preparedInsert.setString(4, book.getPublisher());
        preparedInsert.setInt(5,book.getPublicationYear());
        preparedInsert.setInt(6, book.getPrice());

        return preparedInsert.executeUpdate();
        }

        public List<Book> findByTitle(String input) throws SQLException {
        PreparedStatement preparedSelect = connection.prepareStatement("SELECT * from Books WHERE title LIKE ?");

        preparedSelect.setString(1, input);

        ResultSet resultSet = preparedSelect.executeQuery();
        return fillBooksList(resultSet);
        }

        public int deleteByTitle(String input) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("DELETE * FROM Books WHERE title LIKE ?");
        preparedStatement.setString(1, input);
        return preparedStatement.executeUpdate();
        }

/*        public List<Book> searchEverywhere(String input) throws SQLException {
        PreparedStatement preparedSelect = connection.prepareStatement("SELECT * from Books WHERE ISBN LIKE ? OR author LIKE ? OR title LIKE ? OR publisher LIKE ? OR publication_year LIKE ? OR price LIKE ? ");

        preparedSelect.setInt(1, Integer.parseInt(input));
        preparedSelect.setInt(2, Integer.parseInt(input));
        preparedSelect.setString(3, input);
        preparedSelect.setString(4, input);
        preparedSelect.setInt(5, Integer.parseInt(input));
        preparedSelect.setInt(6, Integer.parseInt(input));

        ResultSet resultSet = preparedSelect.executeQuery();
        return fillBooksList(resultSet);
        }*/



}
