package udemy.university.section13.exceptions;

public class Arithmetic {

    public static int div(int numerator, int denominator) {
        if (denominator == 0)
            throw new RuntimeException("Div: any number is zero");
        return (numerator / denominator);

    }

    public static void sum(int value1, int value2) {
        try {
            if (value1 < 0 || value2 < 0)
                throw new Exception("Sum: Any number is minor to 0");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("The sum is ok");
        }
    }

    public static void rest(int value1, int value2) throws Exception {
        if (value1 < 0 || value2 < 0)
            throw new Exception("Rest: Any number is minor to zero");
        System.out.println((value1 - value2));
    }


}
