package udemy.university.section7;

public class MainSection7 {
    public MainSection7() {
        ifSentence();
    }

    public void ifSentence() {
        System.out.println("*********************** If Sentence ******************");
        IfSentence ifSentence = new IfSentence();
        System.out.println(ifSentence.isMayor());
        System.out.println(ifSentence.isMillionaire());
    }
}
