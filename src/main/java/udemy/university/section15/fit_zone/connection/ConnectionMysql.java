package udemy.university.section15.fit_zone.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMysql {
    public static ConnectionMysql connectionMysql;
    private Connection connection;
    private final String nameDB = "fit_zone_db";
    private final String urlDB = "jdbc:mysql://127.0.0.1:/";
    private final String userDB = "root";
    private final String passDB = "0723/Liverp";

    private ConnectionMysql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(this.urlDB, this.userDB, this.passDB);
            //System.out.println("connected");
        } catch (Exception e) {
            System.out.println("Error to connect DB: " + e.getMessage());
        }
    }

    public static ConnectionMysql getInstance() {
        if (ConnectionMysql.connectionMysql == null) {
            ConnectionMysql.connectionMysql = new ConnectionMysql();
        }
        return ConnectionMysql.connectionMysql;
    }

    public Connection getConnection() {
        return this.connection;
    }

    public static void main(String[] args) {
        var connection = ConnectionMysql.getInstance().getConnection();

        if(connection != null) {
            System.out.print("Connected to DB ...... \s\s" + connection);
        } else {
            System.out.print("Failed to Connect to DB ");
        }
    }
}
