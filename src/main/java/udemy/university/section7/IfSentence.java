package udemy.university.section7;

import java.util.Random;

public class IfSentence {

    public String isMayor() {
        var random = new Random().nextInt(0, 30);
        if(random > 18) {
            return "Is mayor to 18";
        } else if(random > 12 ){
            return "Is mayor to 12";
        } else {
            return "I Minor to 13";
        }
    }
    public String isMillionaire() {
        var random = new Random();
        var isMillionaire = random.nextBoolean();
        if(isMillionaire) {
            return "Is Millionaire: %b".formatted(isMillionaire);
        } else {
            return "Is millionaire: %b".formatted(isMillionaire);
        }

    }
}
