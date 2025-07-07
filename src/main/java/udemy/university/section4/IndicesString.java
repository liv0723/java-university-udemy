package udemy.university.section4;

public class IndicesString {

    public String indicesString() {
        var firstString = "Hello world 1.0";


        char firstCharacter = firstString.charAt(0);
        char lastCharacter = firstString.charAt((firstString.length() -1));
        char middleCharacter = firstString.charAt((int) (firstString.length() / 2));
        return """
                first character: %s
                middle character: %s
                last character: %s
                """.formatted(firstCharacter, middleCharacter, lastCharacter);
    }
}
