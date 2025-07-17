package udemy.university.section7;

import java.util.Scanner;

public class BankingSystem {
    private boolean continueBankingSystem;

    public String toString() {

        var scanner = new Scanner(System.in);

        System.out.print("Do you want out of the Banking System (true/false): ");
        var question = Boolean.parseBoolean(scanner.nextLine());

        if(!question) {
            this.continueBankingSystem = !question;
            return """
                    not want out of the system: %b
                    """.formatted(this.continueBankingSystem);
        } else {
            this.continueBankingSystem = question;
            return """
                    not want out of the system: %b 
                    """.formatted(this.continueBankingSystem);
        }


    }
}
