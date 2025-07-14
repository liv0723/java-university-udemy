package udemy.university.section6;

import java.util.Scanner;

public class ComparisonOperators {

    public String tostring() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the value a: ");
        var valueA = Double.parseDouble(scanner.nextLine());
        System.out.print("Intro the value : ");
        var valueB = Double.parseDouble(scanner.nextLine());

        return String.format("""
                Comparison Operators
                operator ==: %b
                operator !=: %b
                operator >: %b
                operator <: %b
                operator >=: %b
                operator <=: %b
                """,(valueA == valueB), (valueA != valueB), (valueA > valueB), (valueA < valueB), (valueA >= valueB), (valueA <= valueB));

    }
}
