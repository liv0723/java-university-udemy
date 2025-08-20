package udemy.university.section15.fit_zone.presentation;

import udemy.university.section15.fit_zone.domain.Client;
import udemy.university.section15.fit_zone.sevice.ClientDAO;
import udemy.university.section15.fit_zone.sevice.IClientDAO;

import java.util.Scanner;

public class FitZoneApp {
    private static Scanner scanner = new Scanner(System.in);
   // private static IClientDAO clientDAO = new ClientDAO();

    public static void main(String[] args) {
        initializing();
    }

    public static void initializing() {
        var out = false;

        while (!out) {
            try {
                var option = showMenu(scanner);
                IClientDAO clientDAO = new ClientDAO();
                if (option > 0 && option < 7) {
                    out = executeOption(option, clientDAO);
                } else {
                    System.out.println("Option bad");
                }
            } catch (Exception e) {
                System.out.println("Error to execute options: " + e.getMessage());
            }
            System.out.println();
        }
    }

    public static int showMenu(Scanner scanner) {
        var menu = """
                \t\t\t\t ********* App Fit Zone **********
                1: List Clients
                2: Search Client
                3: Insert Client
                4: Update Client
                5: Delete Client
                6: out
                Intro the option: \s""";
        System.out.print(menu);
        return Integer.parseInt(scanner.nextLine());
    }

    public static boolean executeOption(int option, IClientDAO clientDAO) {
        switch (option) {
            case 1 -> {
                var clients = clientDAO.listClient();
                System.out.println("********** list Client ************");
                 clients.forEach(client -> {
                     System.out.println(client.toString());
                 });
                 return false;
            }
            case 2 -> {
                System.out.print("Intro the id: ");
                var id = Integer.parseInt(scanner.nextLine());
                var search = clientDAO.searchClient(new Client(id));
                String msg = (search == true) ? "The client exists": "The client not exist";
                System.out.println(msg);
                return false;
            }
            case 3 -> {
                var added = clientDAO.insertClient(getClient(scanner));
                if(added) System.out.println("Client Add");
                else System.out.println("Client no Add");
                return false;
            }
            case 4 -> {
                System.out.print("Intro the id: ");
                var id = Integer.parseInt(scanner.nextLine());
                //System.out.println();
                System.out.print("Intro the name: ");
                var name = scanner.nextLine();
                //System.out.println();
                System.out.print("Intro the lastname: ");
                var lastname = scanner.nextLine();
                //System.out.println();
                System.out.print("Intro the membreship: ");
                var membreship = Integer.parseInt(scanner.nextLine());

                var update = clientDAO.updateClient(new Client(id, name, lastname, membreship));
                System.out.println(update);
                if (update) {
                    System.out.println("Client update");
                } else {
                    System.out.println("Client not update");
                }
                return false;
            }
            case 5 -> {
                System.out.print("intro the id: ");
                var id = Integer.parseInt(scanner.nextLine());
                var client = new Client(id);
                if(clientDAO.deleteClient(client)) {
                    System.out.println("Client deleted");
                } else {
                    System.out.println("Client not deleted");
                }
                return false;
            }

        }
        return true;
    }

    public static Client getClient(Scanner scanner) {
//        System.out.print("Intro the id: ");
//        var id = Integer.parseInt(scanner.nextLine());
//        System.out.println();
        System.out.print("Intro the name: ");
        var name = scanner.nextLine();
        //System.out.println();
        System.out.print("Intro the lastname: ");
        var lastname = scanner.nextLine();
        //System.out.println();
        System.out.print("Intro the membreship: ");
        var membreship = Integer.parseInt(scanner.nextLine());
        return new Client(name, lastname, membreship);

    }


}
