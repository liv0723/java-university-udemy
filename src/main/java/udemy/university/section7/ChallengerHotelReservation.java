package udemy.university.section7;

import java.util.Scanner;

public class ChallengerHotelReservation {

    private String clientName;
    private int quantityDays;
    private boolean hasSealView;
    private static final double RATE_VIEW = 190.50;
    private static  final double RATE_NOT_VIEW = 150.50;

    public ChallengerHotelReservation() {

    }

    public String toString() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the client name: ");
        this.clientName = scanner.nextLine();

        System.out.print("Intro the quantity of days: ");
        this.quantityDays = Integer.parseInt(scanner.nextLine());

        System.out.print("If have view seal (true/false): ");
        this.hasSealView = Boolean.parseBoolean(scanner.nextLine());

        var cost = 0.0;
         if(this.hasSealView) {
             cost = this.quantityDays * ChallengerHotelReservation.RATE_VIEW;
         } else {
             cost = this.quantityDays * ChallengerHotelReservation.RATE_NOT_VIEW;
         }

         var cost1 = (this.hasSealView)? (this.quantityDays * ChallengerHotelReservation.RATE_VIEW) : (this.quantityDays * ChallengerHotelReservation.RATE_NOT_VIEW);

         return """
                 Hotel Reservation
                 Client name: %s
                 Quantity of days: %d
                 Have view of seal: %b
                 Cost of stay: %.2f
                 Cost1 of stay: %.2f
                 """.formatted(this.clientName, this.quantityDays, this.hasSealView, cost, cost1);
    }
}
