package udemy.university.section15.fit_zone.sevice;

import udemy.university.section15.fit_zone.connection.ConnectionMysql;
import udemy.university.section15.fit_zone.domain.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements IClientDAO{
    private static int count = 0;
    @Override
    public List<Client> listClient() {
        List<Client> clients = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection connection = ConnectionMysql.getConnection();
        var sql = "SELECT * FROM client ORDER BY id";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                var client = new Client();
                client.setId(rs.getInt("id"));
                client.setName(rs.getString("name"));
                client.setLastname(rs.getString("lastname"));
                client.setMembreship(rs.getInt("membreship"));
                clients.add(client);
            }

        } catch(Exception e) {
            System.out.print("Error to list the clients: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Error t close connection with the DB: " + e.getMessage());
                e.printStackTrace();
            }


        }

        return clients;
    }

    @Override
    public boolean searchClient(Client client) {
        PreparedStatement ps;
        ResultSet rs;
        var connection = getConnection();
        var sql = "SELECT * FROM client WHERE id = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, client.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                client.setName(rs.getString("name"));
                client.setLastname(rs.getString("lastname"));
                client.setMembreship(rs.getInt("membreship"));
                System.out.println(++ClientDAO.count + "-" +client.toString());
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error to search client: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (Exception e) {
            }
        }
        return false;
    }

    @Override
    public boolean insertClient(Client client) {
        PreparedStatement ps;
        ResultSet rs;
        var connection = getConnection();
        var sql = "INSERT INTO client (name, lastname, membreship) VALUES (?, ?, ?)";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setString(2, client.getLastname());
            ps.setInt(3, client.getMembreship());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Error to close connection: " + e.getMessage());
                e.printStackTrace();
            }

        }
        return false;
    }

    @Override
    public boolean updateClient(Client client) {
        return false;
    }

    @Override
    public boolean deleteClient(Client client) {
        return false;
    }
    public static Connection getConnection() {
        return ConnectionMysql.getConnection();
    }


}

class Test {
    public static void main(String[] args) {
        System.out.println("*********** Clients **********");
        IClientDAO clientDAO = new ClientDAO();
        var clients = clientDAO.listClient();

        clients.forEach(client -> {
            clientDAO.searchClient(client);
        });


        System.out.println( clientDAO.insertClient(new Client(20, "yan", "Cespedes", 500 )));
    }


}
