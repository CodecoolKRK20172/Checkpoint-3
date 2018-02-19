package com.codecool.kamilpchelka.checkpoint3.database;

import com.codecool.kamilpchelka.checkpoint3.models.Publisher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PublishersDAO extends AbstractDAO {

    public List<Publisher> getPublishers() {
        List<Publisher> publishers = new ArrayList<>();

        String sql = "SELECT * FROM publishers";

        try (Connection connection = getConnection()) {

            try (ResultSet resultSet = connection.createStatement().executeQuery(sql)) {

                while (resultSet.next()) {
                    Publisher publisher = new Publisher();
                    publisher.setId(resultSet.getString(1));
                    publisher.setName(resultSet.getString(2));
                    publisher.setCity(resultSet.getString(3));
                    publisher.setCountry(resultSet.getString(4));

                    publishers.add(publisher);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return publishers;
    }
}
