import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.io.FileInputStream;
import java.sql.*;

public class sqltest {

    private static final String URL = "jdbc:mysql://localhost:3306/sql_test";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection;
        String query = "select * from users;";

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            if (!connection.isClosed()){
                System.out.println("BD is connected");
            }

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int id = resultSet.getInt(1);
                int age = resultSet.getInt(3);
                String email = resultSet.getString(4);
                String name = resultSet.getString(2);
                System.out.println(id + email + age + name);

            }

        } catch (SQLException e) {
            System.out.println("driver load was fail.");
        }


    }

}
