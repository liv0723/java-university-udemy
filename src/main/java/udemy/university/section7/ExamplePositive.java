package udemy.university.section7;

import java.util.Scanner;


public class ExamplePositive {

    public String isPositive() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the value: ");
        var value = Double.parseDouble(scanner.nextLine());

        if(value > 0) {
            return String.format("""
                    the value: %.1f
                    is positive
                    """, value);
        } else if(value == 0) {
            return """
                    the value: %.1f
                    is zero 
                    """.formatted(value);
        } else {
            return """
                    the value: %.1f
                    is negative
                    """.formatted(value);
        }


    }
}
