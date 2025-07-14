package udemy.university.section6;

import java.util.Scanner;

public class ArithmeticOperators {
    public String toString() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the first value: ");
        double valueA = Integer.valueOf(scanner.nextLine());

        System.out.print("Intro the second value: ");
        double valueB = Integer.valueOf(scanner.nextLine());

        var sum = valueA + valueB;
        var multiply = valueA * valueB;
        var rest = valueB - valueA;
        double div = valueA / valueB;
        var module = valueA % valueB;

        return """
                Arithmetic Operators
                sum: %f
                multiply: %f
                rest: %f
                div: %.2f
                module: %f
                """.formatted(sum, multiply, rest, div, module);
    }
}
