package udemy.university.section6;

import java.util.Scanner;

public class DiscountInStore {
    private boolean isMember;
    private int quantityArticle;

    public DiscountInStore() {
        getData();
    }

    public void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the quantity of article: ");
        this.quantityArticle = Integer.parseInt(scanner.nextLine());

        System.out.print("Intro is member o not (true/ false): ");
        this.isMember = Boolean.parseBoolean(scanner.nextLine());

    }

    public String toString() {
       var isAvailable = this.isMember == true && this.quantityArticle >=10;

       return """
               Discount Store
               quantity of article: %d
               is member: %b
               has discount: %b
               """.formatted(this.quantityArticle, this.isMember, isAvailable);
    }
}
