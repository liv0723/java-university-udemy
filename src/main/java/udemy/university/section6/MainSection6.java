package udemy.university.section6;

import java.util.concurrent.TimeUnit;

public class MainSection6 {

    public MainSection6() {
        //arithmeticOperators();
        //unaryOperators();
        //assignmentOperators();
        //comparisonOperators();
        //logicOperators();
        //determineInside();
        //discountStore();
        //library();
        //outRange();
        //ticketSale();
        //authenticationSystem();
        rectangle();
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

    public void discountStore() {
        System.out.println("************************** Discount Store ****************************");

        DiscountInStore discountInStore = new DiscountInStore();
        System.out.println(discountInStore.toString());
    }

    public void library() {
        System.out.println("************************** Library ******************************");

        Library library = new Library();
        System.out.println(library.toString());
    }

    public void outRange() {
        System.out.println("***************************** Out Range *****************************");

        OutRange outRange = new OutRange();
        System.out.println(outRange.toString());
    }

    public void ticketSale() {
        System.out.println("****************************** Ticket Sale *******************************");

        TicketSale ticketSale = new TicketSale();
        System.out.println(ticketSale.toString());
    }
    public void authenticationSystem() {
        System.out.println("***************************** Authentication System ***************************");

        AuthenticationSystem authenticationSystem = new AuthenticationSystem();
        System.out.println(authenticationSystem.toString());
    }

    public void rectangle() {
        System.out.println("************************ Rectangle *******************************");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
    }


}
