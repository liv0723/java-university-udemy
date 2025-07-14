package udemy.university.section6;

import java.util.Scanner;

public class AssignmentOperators {

    public String toString() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the value to work: ");
        var value = Double.parseDouble(scanner.nextLine());

        var addValue = 10.0;
        var restValue = 10.0;
        var divValue = 10.0;
        var mulValue = 10.0;
        var modValue = 1;
        int aux1 = 10, aux2 = 10, aux3 = 10;

        addValue += value;
        restValue -= value;
        divValue /= value;
        mulValue *= value;
        modValue %= value;

        return new String("""
                ASSIGNMENT OPERATORS
                add value: %.1f
                rest value: %.1f
                div value: %.1f
                mul value: %.1f
                mod value: %d 
                """.formatted(addValue, restValue, divValue,mulValue, modValue));
    }
}
