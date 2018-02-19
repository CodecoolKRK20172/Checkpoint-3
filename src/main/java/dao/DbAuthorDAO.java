package dao;

import dao.entry.AuthorEntry;
import dao.statements.sqlQueries;
import model.Author;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbAuthorDAO implements AuthorDAO {
    private DBProcess process = new DBProcess();

    public List<Author> getAuthors() {
        List<Author> authors = new ArrayList<Author>();
        String statement = sqlQueries.getAuthors();

        try {
            ResultSet result = process.executeDisplay(statement);

            while (result.next()) {
                authors.add(new Author(
                        result.getInt(AuthorEntry.author_id.name()),
                        result.getString(AuthorEntry.name.name()),
                        result.getString(AuthorEntry.surname.name()),
                        result.getString(AuthorEntry.brith_year.name()),
                        result.getString(AuthorEntry.city.name()),
                        result.getString(AuthorEntry.country.name())
                        )
                );
            }
        } catch (SQLException e) { System.err.println(e.getClass().getName() + ": " + e.getMessage()); }

        return authors;
    }
}
