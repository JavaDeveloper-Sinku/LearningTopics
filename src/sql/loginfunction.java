package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginfunction {


    public class DatabaseExample {
        public static void main(String[] args) {
            // Database URL, Username, and Password // all Configratio Detil's
            String url = "jdbc:mysql://localhost:3306/mydatabase"; // Replace 'mydatabase' with your database name
            String username = "root"; // Replace with your DB username
            String password = "password"; // Replace with your DB password

            // Establishing a Connection
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connected to the database!");

                // Creating a Statement
                Statement statement = connection.createStatement();

                // Executing a Query
                String query = "SELECT * FROM users"; // Replace 'users' with your table name
                ResultSet resultSet = statement.executeQuery(query);

                // Processing the Result Set
                while (resultSet.next()) {
                    int id = resultSet.getInt("id"); // Replace 'id' with your column name
                    String name = resultSet.getString("name"); // Replace 'name' with your column name
                    System.out.println("ID: " + id + ", Name: " + name);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
