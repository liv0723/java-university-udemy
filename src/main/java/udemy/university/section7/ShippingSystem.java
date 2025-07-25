package udemy.university.section7;

import java.util.Scanner;

public class ShippingSystem {
    private final double NATIONAL_COST = 10;
    private final double INTERNATIONAL_COST = 20;
    private String destination;
    private double weight;

    public  ShippingSystem() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the weight: ");
        this.weight = Double.parseDouble(scanner.nextLine());

        System.out.print("Intro if s (national / international)");
        this.destination = scanner.nextLine().toLowerCase().strip();

    }

    public String toString() {
        var totalCost = "";
        if (this.weight > 0) {
            totalCost  = switch (this.destination) {
                case "national" -> String.valueOf (this.weight * this.NATIONAL_COST);
                case "international" -> String.valueOf(this.weight * this.INTERNATIONAL_COST);
                default -> "The destination Intro are bad";
            };
        } else {
            return "The weight intro are bad";
        }
        return String.format("""
                Cost of Shipping
                Weight: %.2f
                Destination: %s
                Final Cost: %s
                """,this.weight, this.destination, totalCost);

    }

}
