package udemy.university.section12;

public class Arithmetic {

    private int operator1, operator2;

    public Arithmetic(int operator1, int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
        System.out.println(this);
    }

    public Arithmetic() {

    }

    public void sum() {
        var sum = (this.operator1 + this.operator2);
        System.out.println("the sum is: %d".formatted(sum));
    }

    public void rest() {
        var rest = (this.operator1 - this.operator2);
        System.out.println("The rest is: %d".formatted(rest));
    }

    public static void main(String[] args) {
        var arithmetic = new Arithmetic(9, 7);
        var arithmetic2 = new Arithmetic();
        System.out.println(arithmetic);
        System.out.println(arithmetic2);
        //arithmetic.operator1 = 9;
        //arithmetic.operator2 = 4;
        arithmetic.sum();
        arithmetic.rest();
        arithmetic2.sum();
        arithmetic2.rest();
    }


}
