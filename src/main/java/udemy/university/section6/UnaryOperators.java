package udemy.university.section6;

import java.util.Scanner;

public class UnaryOperators {
    public String toString() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the value 3: ");
        var valuePositive = Integer.parseInt(scanner.nextLine());
        System.out.print("Intro the value -2: ");
        var valueNegative = Integer.parseInt(scanner.nextLine());

        return String.format("""
                Unary operators
                convert to positive -2: %d
                convert to negative 3:%d
                add one to 3: %d
                rest one to 3: %d
                """, -valueNegative, -valuePositive, ++valuePositive, --valuePositive);
    }
}
