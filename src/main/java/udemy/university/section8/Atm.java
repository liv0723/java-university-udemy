package udemy.university.section8;

import java.util.Scanner;

public class Atm {
    private double balance = 1000;
    private static final String OPTIONS_MENU = """
                1. Consult Balance
                2. Retired
                3. Deposit
                4. exit
                """;

    public static void main(String [] rgs) {
        atm();
    }

    public static void atm() {
        var scanner = new Scanner(System.in);
        var chance = false;
        var atm = new Atm();


        while (!chance) {
            System.out.println(OPTIONS_MENU);
            var optionsSelected = Integer.parseInt(scanner.nextLine());
            var money = 0.0;

            switch (optionsSelected) {
                case 1 -> {
                    System.out.println("The balance is : %f ".formatted(new Atm().balance));
                }
                case 2 -> {
                    System.out.print("Intro the quantity to retired: ");
                    var value = Double.parseDouble(scanner.nextLine());
                    if (value > atm.balance) {
                        System.out.println("The mount to retired is mayor to balance:");
                    } else {
                        atm.balance -= value;
                        System.out.println("The new balance is: %f".formatted(atm.balance));
                    }
                }
                case 3 -> {
                    System.out.print("Intro the quantity to Intro: ");
                    var value = Double.parseDouble(scanner.nextLine());
                    if (value >= 1) {
                        atm.balance += value;
                        System.out.println("The new balance is: %f".formatted(atm.balance));
                    }

                }
                case 4 -> {
                    System.out.println("exiting .....");
                }
            }

        }


    }

}
