package udemy.university.section8;

import java.util.Random;

public class WhileCycle {

    public void printNumbers() {
        var random = new Random().nextInt(1, 20);

        while (random > 0) {
            System.out.print(random-- + " ");
        }
    }

    public void printPairNumber() {
        var random = new Random().nextInt(10, 20);

        while (random > 0) {
            if (random %2 ==0) {
                System.out.print(random-- + " ");
            }
            random --;
        }
    }
}
