package udemy.university.section4;

import javax.swing.plaf.synth.SynthButtonUI;

public class SubString {
    private String firstString;

    public SubString() {
        firstString = "Hello World";
    }

    public String generateSubStrings() {
        var first = firstString.substring(0, 5);
        var second = firstString.substring(5);
        var three = firstString.subSequence(0, 3);
        return """
                Sub Strings
                first: %s
                second: %s
                three: %s
                """.formatted(first, second, three);
    }

}
