package udemy.university.section4;

public class ClassString {

    public String toString() {
        var firstString = "hello";
        var secondString = new String("hello");
        var threeString = firstString + "\t" + secondString;
        var fourString = """
                hello
                """;

        return String.valueOf(compareToObject(secondString, fourString));

    }
    public boolean compareToObject(String first, String second ) {
        return (first == second);
    }
    public boolean compareToValue(String first, String second) {
        return (first.equals(second));
    }

}
