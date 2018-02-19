package com.codecool.kamilpchelka.checkpoint3.database;

import com.codecool.kamilpchelka.checkpoint3.models.Author;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDAO extends AbstractDAO {

    public List<Author> getAuthors() throws SQLException {
        List<Author> authors = new ArrayList<>();

        String sql = "SELECT * FROM authors";

        try (Connection connection = getConnection()) {

            try (ResultSet resultSet = connection.createStatement().executeQuery(sql)) {

                while (resultSet.next()) {
                    Author author = new Author();
                    author.setId(resultSet.getInt(1));
                    author.setName(resultSet.getString(2));
                    author.setSurname(resultSet.getString(3));
                    author.setBirthYear(resultSet.getInt(4));
                    author.setCity(resultSet.getString(5));
                    author.setCountry(resultSet.getString(6));

                    authors.add(author);
                }
            }

        }

        return authors;
    }
}
