package udemy.university.section6;

import java.util.Scanner;

public class TicketSale {

    public String toString() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the price of apple: ");
        var applePrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Intro the price of tomatoes: ");
        var tomatoesPrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Intro the value of tax (5/10/15): ");
        var tax = Double.parseDouble(scanner.nextLine());

        var subTotal = applePrice + tomatoesPrice;
        var percentTax = (subTotal * tax) / 100;

        return """
                \t\t\t\t\t\tTicket Sale
                apple price: $%.2f
                tomatoes price: $%.2f
                sub total: $%.2f
                tax: %%%.0f - $%.2f
                total: $%.2f
                """.formatted(applePrice, tomatoesPrice, subTotal, tax, percentTax,(subTotal - percentTax));
    }
}
