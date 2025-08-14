package udemy.university.section15.fit_zone.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMysql {

    public static Connection getConnection() {
        Connection connection = null;
        var nameDB = "fit_zone_db";
        var url = "jdbc:mysql://127.0.0.1:3306/" + nameDB;
        var userDB = "root";
        var passBD = "0723/Liverp";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userDB, passBD);

        } catch(Exception e) {
            System.out.print("Error to connect DB: " + e.getMessage());
            e.printStackTrace();
        }

        return connection;
    }

    public static void main(String[] args) {
        var connection = ConnectionMysql.getConnection();

        if(connection != null) {
            System.out.print("Connected to DB ...... \s\s" + connection);
        } else {
            System.out.print("Failed to Connect to DB ");
        }
    }
}
