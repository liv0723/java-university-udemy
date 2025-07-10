package udemy.university.section4;

public class ConcatenationString {

    public String toString() {
        var first = "Hello";
        var second = "World";
        var three = new StringBuilder().append(first).append(" ").append(second);
        var four = new StringBuffer().append(first).append(" ").append(second);
        return """
                using +: %s 
                using concat: %s
                using String Building: %s
                using String Buffer: %s
                using Join: %s
                """.formatted((first + " " +second), ("".concat(first).concat(" "+second)), three, four, String.join(" ", first, second));
    }
}
