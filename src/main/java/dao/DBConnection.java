package dao;

import java.sql.*;

public class DBConnection{

    public Connection makeConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:src/main/java/database/data.db");

        connection.setAutoCommit(false);

        return connection;
    }

    public Statement setUpStatement(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        return statement;
    }

    public void closeConnections(Statement statement, Connection connection) {

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) { System.err.println("Request hasn\'t been closed properly."); }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) { System.err.println("Connection hasn\'t been closed properly."); }
        }
    }
}


