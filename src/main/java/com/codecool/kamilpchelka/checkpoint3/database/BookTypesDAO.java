package com.codecool.kamilpchelka.checkpoint3.database;

import com.codecool.kamilpchelka.checkpoint3.models.TypeBook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookTypesDAO extends AbstractDAO {

    public List<TypeBook> getTypeBooks() throws SQLException {
        List<TypeBook> typebooks = new ArrayList<>();

        String sql = "SELECT * FROM typebook";

        try (Connection connection = getConnection()) {

            try (ResultSet resultSet = connection.createStatement().executeQuery(sql)) {

                while (resultSet.next()) {
                    TypeBook publisher = new TypeBook(resultSet.getInt(1), resultSet.getString(2));
                    typebooks.add(publisher);
                }
            }

        }

        return typebooks;
    }
}
