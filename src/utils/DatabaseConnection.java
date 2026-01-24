package utils;

import exception.DatabaseOperationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:sqlite:restaurant.db";

    public static Connection getConnection() throws DatabaseOperationException {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            throw new DatabaseOperationException("Failed to connect to database", e);
        }
    }
}