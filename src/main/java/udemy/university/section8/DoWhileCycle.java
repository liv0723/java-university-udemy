package udemy.university.section8;

import java.util.Random;

public class DoWhileCycle {

    public static void main(String [] args) {
       // printCont();
        printOddNumber();
    }

    public static void printCont() {
        var cont = 1;

        do {
            System.out.print(cont++ + " ");
        } while (cont < 10);
    }

    public static void printOddNumber() {

        var random = new Random().nextInt(10, 20);

        do {
            if (random % 2 != 0) {
                System.out.print(random + " ");
            }
            random--;
        } while (random >= 0);

    }
}
