package udemy.university.section8;

import java.util.Random;

public class SumAccumulator {

    public static void main(String [] args) {
        sumAccumulatorWhile();
        sumAccumulatorDoWhile();
        sumAccumulatorFor();
    }

    public static void sumAccumulatorWhile() {
        var random = new Random().nextInt(10, 15);
        var iteration = 0;
        var sum = 0;

        while (iteration <= random) {
            sum += iteration++;
        }
        System.out.println("""
                while
                the number of iteration is: %d
                the sum is : %d
                """.formatted(random, sum));

    }

    public static void sumAccumulatorDoWhile() {
        var random = new Random().nextInt(10, 20);
        var cont = 0;
        var sum = 0;

        do {
            sum += cont;
            cont++;
        } while (cont < random);

        System.out.println("""
                do while
                the number of iteration is: %d
                the sum is: %d
                """.formatted(cont, sum));
    }

    public static  void sumAccumulatorFor() {
        var random = new Random().nextInt(10, 20);
        var sum = 0;
        var cont = 0;

        for (; cont < random; cont++) {
            sum += cont;
        }

        System.out.println("""
                do for
                the number of iteration is: %d
                the sum is: %d
                """.formatted(cont, sum));
    }
}
