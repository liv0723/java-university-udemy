package udemy.university.section14.snacks_machine.presentation;

import udemy.university.section14.snacks_machine.entity.Snack;
import udemy.university.section14.snacks_machine.service.IServiceSnacks;
import udemy.university.section14.snacks_machine.service.ServiceSnacksList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnacksMachine {

    public static void main(String[] args) {
        snackMachine();
    }

    public static void snackMachine() {
        var out = false;
        var console = new Scanner(System.in);
        List<Snack> snacks = new ArrayList<>();
        IServiceSnacks iserviceSnacksList = new ServiceSnacksList();

        System.out.println("************** Machine Snacks **************");
        System.out.println();
        iserviceSnacksList.showSnacks();

        while (!out) {
            try {
                var option = showMenu(console);
                out = doOption(option, console, snacks, iserviceSnacksList);
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

    public static boolean doOption(int option, Scanner console, List<Snack> snacks, IServiceSnacks iServiceSnacks) {
        var out = false;

        switch(option)
        {
            case 1 -> toBuySnack(console, snacks, iServiceSnacks);
            case 2 -> showTicket(snacks);
            case 3 -> {
                addSnack(console, iServiceSnacks);
                iServiceSnacks.showSnacks();
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

    private static void toBuySnack(Scanner console, List<Snack> snacks, IServiceSnacks iServiceSnacks) {
        System.out.print("What snack you can to buy (ID)?: ");
        var idSnack = Integer.parseInt(console.nextLine());
        var snackFounded = false;
        for (var snack : iServiceSnacks.getSnacks()) {
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

    private static void addSnack(Scanner console, IServiceSnacks iServiceSnacks) {
        System.out.print("Intro the name of new Snack: ");
        var name = console.nextLine();
        System.out.println();
        System.out.print("Intro the price: ");
        var price = Double.parseDouble(console.nextLine());

        iServiceSnacks.addSnack(new Snack(name, price));
        System.out.println("The snack was added");
    }
}
