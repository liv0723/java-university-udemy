package udemy.university.section4;

public class ImmutabilityString {

    public String toString() {
        var firstString = "Hello";
        var aux = firstString;
        firstString = "world";

        return """
                first variable: %s
                aux variable: %s
                """.formatted(firstString, aux);
    }
}
