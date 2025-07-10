package udemy.university.section4;

import java.util.Random;

public class ReplaceSubString {
    private String stringOriginal;

    public ReplaceSubString() {
        this.stringOriginal = "0-1-2-3-4-5-6-7-8-9";
    }
    public String replaceSubString() {
        var toReplace = new Random().nextInt(10, 20);
        var newStringReplace = stringOriginal.replace("1", String.valueOf(toReplace));
        return """
                Replace Sub String
                old: %s
                newL %s
                """.formatted(stringOriginal, newStringReplace);

    }
}
