package udemy.university.section12;

public class Arithmetic {

    private int operator1, operator2;

    public void sum() {
        var sum = (operator1 + operator2);
        System.out.println("the sum is: %d".formatted(sum));
    }

    public void rest() {
        var rest = (operator1 - operator2);
        System.out.println("The rest is: %d".formatted(rest));
    }

    public static void main(String[] args) {
        var arithmetic = new Arithmetic();
        arithmetic.operator1 = 9;
        arithmetic.operator2 = 4;
        arithmetic.sum();
        arithmetic.rest();
    }


}
