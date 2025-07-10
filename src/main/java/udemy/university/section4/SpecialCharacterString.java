package udemy.university.section4;

public class SpecialCharacterString {
    public String toString() {
        var message = "Hello World";
        return """
                natural: %s
                tab : \t%s
                new line: \n\t\t\t%s
                add quote: \'%s\'
                add double quote: \"%s\"
                """.formatted(message, message, message, message, message);
    }
}
