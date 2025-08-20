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
        Connection connection = ConnectionMysql.getInstance().getConnection();
        var sql = "SELECT * FROM fit_zone_db.client ORDER BY id";

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
                //connection.close();
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
        var sql = "SELECT * FROM fit_zone_db.client WHERE id = ?";

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
                //connection.close();
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
        var sql = "INSERT INTO fit_zone_db.client (name, lastname, membreship) VALUES (?, ?, ?)";

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
                //connection.close();
            } catch (Exception e) {
                System.out.println("Error to close connection: " + e.getMessage());
                e.printStackTrace();
            }

        }
        return false;
    }

    @Override
    public boolean updateClient(Client client) {
        PreparedStatement ps;
        ResultSet rs;
        String sql = "UPDATE fit_zone_db.client SET name = ?, lastname = ?, membreship = ? WHERE id = ?";
        Connection connection = getConnection();
        var aux = false;

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setString(2, client.getLastname());
            ps.setInt(3, client.getMembreship());
            ps.setInt(4, client.getId());
//            if (ps.execute() ) {
//
//                return true;
//            }
            aux = ps.execute();
            System.out.println(aux);

        } catch (Exception e) {
            System.out.println("Error to update client: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                //connection.close();
            } catch (Exception e) {
                System.out.println("Error to closing the connection: " + e.getMessage());
            }
        }
        return aux;
        //return false;
    }

    @Override
    public boolean deleteClient(Client client) {
        PreparedStatement ps;
        ResultSet rs;
        var sql = "DELETE FROM fit_zone_db.client WHERE id = ?";
        Connection connection = getConnection();
        boolean result = true;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, client.getId());
            result = ps.execute();
        } catch (Exception e) {
            System.out.println("Error to deleting client: " + e.getMessage());
        } finally {
            try {
                //connection.close();
            } catch (Exception e) {
                System.out.println("Error to closing the connection: " + e.getMessage());
            }
        }
        return result;
    }
    public static Connection getConnection() {
        return ConnectionMysql.getInstance().getConnection();
    }


}

class Test {
    public static void main(String[] args) {
        System.out.println("*********** Clients **********");
        IClientDAO clientDAO = new ClientDAO();
        var clients = clientDAO.listClient();
        clients.forEach(client -> System.out.println(client.toString()));



    }


}
