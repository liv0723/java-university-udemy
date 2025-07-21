package udemy.university.section7;

import java.net.Inet4Address;
import java.util.Scanner;

public class Mayor {
    private int firstNumber;
    private int secondNumber;

    public Mayor() {
        getData();
    }

    public void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the first Number: ");
        this.firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Intro the second Number: ");
        this.secondNumber = Integer.parseInt(scanner.nextLine());

    }

    public String toString() {
        var comparison = (this.firstNumber > this.secondNumber)? "The first numbers is mayor" : (this.secondNumber > this.firstNumber)? "The second number is mayor" : "The numbers are equals";
         return """
                 Comparison Two Numbers
                 The first number is: %d
                 The second number is: %d
                 %s
                 """.formatted(this.firstNumber, this.secondNumber, comparison);
    }
}
