package udemy.university.pattern.creationals.singleton.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMysql implements MyConnection {

    public static ConnectionMysql connectionMysql = null;
    public static int count = 0;
    private int numberConnection;

    private ConnectionMysql() {}

    public static ConnectionMysql getConnectionMysql() {
        if (ConnectionMysql.connectionMysql == null){
            connectionMysql = new ConnectionMysql();
            connectionMysql.setNumberConnection(7);
        }
        else {
            //connectionMysql = new ConnectionMysql();
            connectionMysql.setNumberConnection(8);
        }

        count++;

        return ConnectionMysql.connectionMysql;
    }

    @Override
    public Connection getConnection() {
        Connection connectionMysql = null;

        var nameDB = "fit_zone_db";;
        var urlDB = "jdbc:mysql://127.0.0.1/" + nameDB;
        var userDB = "root";
        var passDB = "0723/Liverp";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connectionMysql = DriverManager.getConnection(urlDB, userDB, passDB);

        } catch (Exception e) {
            System.out.println("Error to connect DB: " + e.getMessage());

        }
        return connectionMysql;

    }

    public int getNumberConnection() {
        return numberConnection;
    }

    public void setNumberConnection(int numberConnection) {
        this.numberConnection = numberConnection;
    }

    public static void main(String[] args) {
        ConnectionMysql connectionMysql1 = ConnectionMysql.getConnectionMysql();
        ConnectionMysql connectionMysql2 = ConnectionMysql.getConnectionMysql();

        if (connectionMysql1 != null) {
            System.out.println(connectionMysql.getNumberConnection() + "---" + count);
        }

        if (connectionMysql2 != null) {
            System.out.println(connectionMysql.getNumberConnection() + "---" + count);
        }



    }

}
