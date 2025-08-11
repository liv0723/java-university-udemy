package udemy.university.section13.collections.snack_machine;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SnacksMachine {

    public static void main(String[] args) {
        snackMachine();
    }

    public static void snackMachine() {
        var out = false;
        var console = new Scanner(System.in);
        List<Snack> snacks = new ArrayList<>();

        System.out.println("************** Machine Snacks **************");
        System.out.println();
        Snacks.showSnacks();

        while (!out) {
            try {
                var option = showMenu(console);
                out = doOption(option, console, snacks);
            } catch (Exception e) {
                System.out.println("Do error" + e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }

    private static int showMenu(Scanner console) {
        System.out.print("""
                Menu:
                1. Buy Snack
                2. Show Ticket
                3. Add new Snack
                4. Out
                Choose a option: \s""");
        return Integer.parseInt(console.nextLine().strip().toLowerCase());

    }

    public static boolean doOption(int option, Scanner console, List<Snack> snacks) {
        var out = false;

        switch(option)
        {
            case 1 -> toBuySnack(console, snacks);
            case 2 -> showTicket(snacks);
            case 3 -> {
                addSnack(console);
                Snacks.showSnacks();
            }
            case 4 -> {
                out = true;
                System.out.println("Exit....");
            }
            default -> {
                System.out.println("The option selected was bad, please intro again other option");

            }
        }
        return out;
    }

    private static void toBuySnack(Scanner console, List<Snack> snacks) {
        System.out.print("What snack you can to buy (ID)?: ");
        var idSnack = Integer.parseInt(console.nextLine());
        var snackFounded = false;
        for (var snack : Snacks.getSnacks()) {
            if (idSnack == snack.getIdSnack()) {
                snacks.add(snack);
                System.out.println("Snack add: " + snack);
                snackFounded = true;
                break;
            }
        }
        if (!snackFounded) {
            System.out.println("Id of snack not founded: " + idSnack);
        }

    }

    private static void showTicket(List<Snack> snacks) {
        var ticket = "***** Ticket of sale *****";
        var total = 0.0;
        for (var snack : snacks) {
            ticket += "\n\t-" + snack.getNameSnack() + " - $" + snack.getPriceSnack();
            total += snack.getPriceSnack();
        }
        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    private static void addSnack(Scanner console) {
        System.out.print("Intro the name of new Snack: ");
        var name = console.nextLine();
        System.out.println();
        System.out.print("Intro the price: ");
        var price = Double.parseDouble(console.nextLine());

        Snacks.addSnack(new Snack(name, price));
        System.out.println("The snack was added");


    }
}
