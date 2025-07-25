package udemy.university.section7;

import javax.crypto.spec.PSource;

public class MainSection7 {
    public MainSection7() {
        //ifSentence();
        //examplePositive();
        //onLineStore();
        //bankingSystem();
        //mirrorHouse();
        //ternaryOperator();
        //appFitness();
        //challengerHotelReservation();
        //mayor();
        //seasonYear();
        //switchSentence();
        //dayWeek();
        //gradingSystem();
        //shippingSystem();
        authenticationSystem();
    }

    public void ifSentence() {
        System.out.println("*********************** If Sentence ******************");
        IfSentence ifSentence = new IfSentence();
        System.out.println(ifSentence.isMayor());
        System.out.println(ifSentence.isMillionaire());
    }

    public void examplePositive() {
        System.out.println("************************** Positive Example *******************");
        ExamplePositive examplePositive = new ExamplePositive();
        System.out.println(examplePositive.isPositive());
    }
    public void onLineStore() {
        System.out.println("***************************** OnLine Store **************************");
        OnlineStore onlineStore = new OnlineStore();
        System.out.println(onlineStore.toString());
    }

    public void bankingSystem() {
        System.out.println("**************************** Banking System **************************");
        BankingSystem bankingSystem = new BankingSystem();
        System.out.println(bankingSystem.toString());
    }

    public void mirrorHouse() {
        System.out.println("**************************** Mirror House *************************");
        MirrorHouse mirrorHouse = new MirrorHouse();
        System.out.println(mirrorHouse.toString());
    }

    public void ternaryOperator() {
        System.out.println("***************************Ternary Operator*****************");
        TernaryOperator ternaryOperator = new TernaryOperator();
        System.out.println(ternaryOperator.toString());
    }

    public void appFitness() {
        System.out.println("***************************** App Fitness ***************************");
        AppFitness appFitness = new AppFitness();
        System.out.println(appFitness.toString());
    }

    public void challengerHotelReservation() {
        System.out.println("********************************** Challenger Reservation Hotel *********************************");
        ChallengerHotelReservation challengerHotelReservation = new ChallengerHotelReservation();
        System.out.println(challengerHotelReservation.toString());
    }

    public void mayor() {
        System.out.println("***************************** Mayor ***************************");
        Mayor mayor = new Mayor();
        System.out.println(mayor.toString());
    }

    public void seasonYear() {
        System.out.println("***************************** Season year *************************");
        SeasonYear seasonYear = new SeasonYear();
        System.out.print(seasonYear.toString());
        System.out.println(seasonYear.seasonYear());
    }

    public void switchSentence() {
        System.out.println("**************************** Switch Sentence ******************************");
        SwitchSentence switchSentence = new SwitchSentence();
        System.out.println(switchSentence.syntaxClassic());
    }

    public void dayWeek() {
        System.out.println("****************************** Day Week *******************************");
        DayWeek dayWeek = new DayWeek();
        System.out.println(dayWeek.dayWeekClassic());
        System.out.println(dayWeek.dayWeekBetter());
    }

    public void gradingSystem() {
        System.out.println("********************************* Grading System ****************************");
        GradingSystem gradingSystem = new GradingSystem();
        System.out.println(gradingSystem.toString());
    }

    public void shippingSystem() {
        System.out.println("******************************** Shipping System ******************************");
        ShippingSystem shippingSystem = new ShippingSystem();
        System.out.println(shippingSystem.toString());
    }

    public void authenticationSystem() {
        System.out.println("****************************** Authentication System *************************");
        AuthenticationSystem authenticationSystem = new AuthenticationSystem();
        System.out.println(authenticationSystem.toString());
    }
}
