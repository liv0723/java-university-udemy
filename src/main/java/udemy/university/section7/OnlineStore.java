package udemy.university.section7;

import java.util.Scanner;

public class OnlineStore {
    private static final double tenPercent = 0.1;
    private static final double fivePercent = 0.05;
    private boolean isMember;
    private double amount;

    public OnlineStore() {
        getData();
    }

    public void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("Is member of store: ");
        this.isMember = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Intro the mount of shopping: ");
        this.amount = Double.parseDouble(scanner.nextLine());
    }

    public String toString() {

        var finalAmount = this.amount;
        var discountTennPercent = 0.0;
        var discountFivePercent = 0.0;
        var message = """
                    OnLine Store
                    Amount: %f
                    has discount of: %s
                    value of discount: %f
                    Final amount: %f
                    """;
        if(this.isMember && this.amount > 10000) {
            discountTennPercent = this.amount * OnlineStore.tenPercent;
            return String.format(message, this.amount, "10%", discountTennPercent, (this.amount - discountTennPercent));
        } else if(this.isMember) {
            discountFivePercent = this.amount * OnlineStore.fivePercent;
            return String.format(message, this.amount, "5%", discountFivePercent, (this.amount - discountFivePercent));
        } else {
            return String.format(message, this.amount, "0%", 0.0, (this.amount - 0.0) );
        }
    }

}
