package udemy.university.section6;

public class MainSection6 {

    public MainSection6() {
        //arithmeticOperators();
        //unaryOperators();
        //assignmentOperators();
        //comparisonOperators();
        //logicOperators();
        determineInside();
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

    public void comparisonOperators() {
        System.out.println("********************** Comparison Operators ***********************");
        ComparisonOperators comparisonOperators = new ComparisonOperators();
        System.out.println(comparisonOperators.tostring());
    }

    public void logicOperators() {
        System.out.println("********************* Logic Operator **************************");
        LogicOperators logicOperators = new LogicOperators();
        System.out.println(logicOperators.toString());
    }

    public void determineInside() {
        System.out.println("********************** Determine Inside ***************************");
        DetermineInside determineInside = new DetermineInside();
        System.out.println(determineInside.toString());
    }

}
