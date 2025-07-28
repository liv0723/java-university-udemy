package udemy.university.section8;

import java.util.Scanner;

public class PassValidator {
    public static String pass = "";

    public static void main(String [] args) {
        passValidator();

    }

    public static void passValidator() {
        var scanner = new Scanner(System.in);
        while (pass.length() < 6 ) {
            System.out.print("Intro the pass: ");
            pass = scanner.nextLine();
        }
        System.out.println("Pass ok !!!!!");
    }
}
