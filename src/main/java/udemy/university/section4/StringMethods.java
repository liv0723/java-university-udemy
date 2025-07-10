package udemy.university.section4;

public class StringMethods {
    public String toString() {
        var longitude = "pepe".length();

        var newString = "hello";
        newString = newString.replace('e', 'E');

        var upperString = newString.toUpperCase();
        var lowerString = upperString.toLowerCase();

        var trimString = " Hello World ".trim();
        var stripString = " Hello World ".strip();


        return """
                length method: %d
                replace method: %s
                toUpperCase method: %s
                toLowerCase method: %s
                trim method: %s
                strip method: %s
                """.formatted(longitude, newString, upperString, lowerString, trimString, stripString);
    }
}
