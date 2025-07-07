package udemy.university.section4;

public class ComparisonString {

    public String toString() {
        var string1 = "java";
        var string2 = "java";
        var string3 = new String("java");

        String comparisonFirst = String.valueOf(string1 == string2);
        String comparisonSecond = String.valueOf(string1 == string3);
        String comparisonThree = String.valueOf(string1.equals(string3));

        return """
                first Comparison Reference: %s
                second Comparison Reference: %s
                three Comparison Content: %s
                """.formatted(comparisonFirst, comparisonSecond, comparisonThree);
    }
}
