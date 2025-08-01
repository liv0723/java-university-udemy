package udemy.university.section11;

import java.util.Random;
import java.util.Scanner;

public class Functions {

    private static int total = 0;

    public static void main(String[] args) {
        var random = new Random();
        var scanner = new Scanner(System.in);

        var arg1 = random.nextInt();
        var arg2 = random.nextInt();
        var result = sum(arg1, arg2);
        System.out.print("Intro the value: ");
        var isPair = Integer.parseInt(scanner.nextLine());

        //System.out.println("The sum is: %d".formatted(result));
        //System.out.println("The number %d is pair: %b".formatted(arg1, isPair));
        System.out.println(isRecursive(3));
    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    public static boolean isPair(int arg) {
        return (arg % 2 == 0) ? true : false;
    }

    public static int isRecursive(int arg) {
        if (arg == 0)
            return (total +=arg);
        else {
            isRecursive(arg-1);
            return (total += arg) ;
        }
    }
}
