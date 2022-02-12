package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_schema", "root", "ыеФп34яЬуь9оКв");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getDataConnection () {
        return connection;
    }

    public Util() throws SQLException {
    }
}
