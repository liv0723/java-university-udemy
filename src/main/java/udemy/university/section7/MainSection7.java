package udemy.university.section7;

import javax.crypto.spec.PSource;

public class MainSection7 {
    public MainSection7() {
        //ifSentence();
        //examplePositive();
        //onLineStore();
        bankingSystem();
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
}
