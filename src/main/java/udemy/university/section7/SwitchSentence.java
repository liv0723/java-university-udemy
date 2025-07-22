package udemy.university.section7;

import java.util.Random;
import java.util.Scanner;

public class SwitchSentence {

    public String syntaxClassic() {
        var number = new Random().nextInt(0, 5);
        var result = "";

        switch(number) {
            case 1:
                result = "1";
                break;
            case 2:
                result = "2";
                break;
            case 3:
                result = "3";
                break;
            case 4:
                result = "4";
                break;
            default :
                result = "Failed";
        }
        return """
                Syntax Classic
                The number is: %s
                """.formatted(result);

    }


}
