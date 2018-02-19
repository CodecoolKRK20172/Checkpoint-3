package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBProcess {

    public ResultSet executeDisplay(String sqlStatement) throws SQLException {
        DBConnection connection = new DBConnection();
        Connection DBLinked = connection.makeConnection();

        Statement statement = connection.setUpStatement(DBLinked);
        ResultSet result = statement.executeQuery(sqlStatement);

//        connection.closeConnections(statement, DBLinked);
        return result;
    }

    public void executeUpdateDB(String query) {
        DBConnection connection = new DBConnection();

        try {
            Connection DBLinked = connection.makeConnection();
            Statement statement = connection.setUpStatement(DBLinked);

            statement.executeUpdate(query);
            DBLinked.commit();
            connection.closeConnections(statement, DBLinked);
        }
        catch (SQLException e) { System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
