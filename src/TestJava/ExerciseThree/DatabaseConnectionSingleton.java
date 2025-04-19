package TestJava.ExerciseThree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionSingleton {

    /*The singleton is a design pattern that ensures that a class has only one instance
    throughout the entire application, and provides a global access point to that instance.
    We use it when we only need one instance of a class globally.
    It's useful when only one object is needed, like a shared
    database connection to avoid creating multiple expensive connections.
    */

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:65432/security_db", "user", "very-secure-password");
        }
        return connection;
    }



    public static void main(String[] args) throws Exception {
        Connection connection1 = DatabaseConnectionSingleton.getConnection();
        Connection connection2 = DatabaseConnectionSingleton.getConnection();

        System.out.println(connection1 == connection2); // true
    }

}
