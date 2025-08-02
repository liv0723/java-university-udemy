package udemy.university.section12;

public class ArithmeticEncapsulation {
    private int operator1;
    private int operator2;

    public ArithmeticEncapsulation(int operator1, int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return this.operator1;
    }

    public int getOperator2() {
        return this.operator2;
    }

    public void setOperator1(int operator1) {
        this.operator1 = operator1;
    }

    public void setOperator2(int operator2) {
        this.operator2 = operator2;
    }

    public String sum() {
        return "The sum is: %d".formatted((this.operator2 + this.operator2));
    }

    public String  rest() {
        return String.format("The rest is: %d", (this.operator1 - this.operator2));
    }

}

class Menu {

    public static void main(String[] args) {
        ArithmeticEncapsulation encapsulation = new ArithmeticEncapsulation(1, 1);
        System.out.println(encapsulation.sum());
        encapsulation.setOperator1(3);
        encapsulation.setOperator2(7);
        System.out.println(encapsulation.rest());
    }

}
