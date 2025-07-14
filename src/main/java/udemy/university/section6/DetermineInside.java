package udemy.university.section6;

import java.util.Scanner;

public class DetermineInside {

    public String toString() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the initial value of range: ");
        var initial = Double.parseDouble(scanner.nextLine());
        System.out.println("Intro the final value of range: ");
        var end = Double.parseDouble(scanner.nextLine());
        System.out.print("Intro the vale to evaluate: ");
        var value = Double.parseDouble(scanner.nextLine());

        var expressionResult = (value > initial && value < end);

        return """
                Determine Inside
                initial range: %f
                end range: %f
                result: %b
                """.formatted(initial, end, expressionResult);
    }
}
