import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Making_Connection_JDBC_WorkBench {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Kafil";
        String username = "root";
        String password = "Alam@800";

        try {
            // Attempt to connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");
            // Close the connection
            connection.close();
        } catch (SQLException e) {
            // Handle any errors that may have occurred
            System.err.println("Error: Unable to connect to the database!");
            e.printStackTrace();
        }
    }
}
