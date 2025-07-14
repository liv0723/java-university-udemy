package udemy.university.section6;

public class MainSection6 {

    public MainSection6() {
        //arithmeticOperators();
        //unaryOperators();
        assignmentOperators();
    }

    public void arithmeticOperators() {
        System.out.println("********************* Arithmetics Operators ************************ ");
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        System.out.println(arithmeticOperators.toString());
    }

    public void unaryOperators() {
        System.out.println("********************* Unary Operators *************************");
        UnaryOperators unaryOperators = new UnaryOperators();
        System.out.println(unaryOperators.toString());
    }

    public void assignmentOperators() {
        System.out.println("******************** Assignment Operators ***********************");
        AssignmentOperators assignmentOperators = new AssignmentOperators();
        System.out.println(assignmentOperators.toString());
    }

}
