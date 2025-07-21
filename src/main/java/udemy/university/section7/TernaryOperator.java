package udemy.university.section7;

import java.net.Inet4Address;
import java.util.Random;
import java.util.Scanner;

public class TernaryOperator {

    public TernaryOperator() {

    }

    public String toString() {
        var number = new Random().nextInt(-10, 10);
        var scanner = new Scanner(System.in);

        System.out.print("Intro the age of user: ");
        var age = Integer.parseInt(scanner.nextLine());

        var isPair = (number % 2 == 0) ? true : false;
        var isPositive = (number > 0) ? true : (number == 0) ? true : false;
        var isMayor = (age >= 18) ? true : false;

        return String.format("""
                is par the number %d: %b
                is positive: %b
                is mayor: %b
                """, number, isPair, isPositive, isMayor);
    }
}
