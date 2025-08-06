package udemy.university.section13.exceptions;

import java.util.concurrent.ExecutionException;

public class TestArithmetic {
    public static void main(String[] args) {
        try {
            var result = Arithmetic.div(3, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("The div is ok");
        }

        System.out.println();
        Arithmetic.sum(3,-2);

        try {
            System.out.println();
            Arithmetic.rest(2,-5);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("The rest is ok");
        }


    }
}
