package udemy.university.section6;

import java.util.Scanner;

public class LogicOperators {

    public String toString() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro thr first value (true/false): ");
        var valueA = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Intro the second value (true/false): ");
        var valueB = Boolean.parseBoolean(scanner.nextLine());

        var expressionAnd = (valueA && valueB);
        var expressionOr = (valueA || valueB);

        return String.format("""
                Logic Operators
                and %b - %b: %b
                or %b - %b: %b
                not %b: %b
                """,valueA, valueB, expressionAnd , valueA, valueB, expressionOr, valueA, !valueA);
    }
}
