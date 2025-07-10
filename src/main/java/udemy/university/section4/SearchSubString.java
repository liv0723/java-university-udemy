package udemy.university.section4;
import java.util.Random;

public class SearchSubString {
    private String stringToSearch;

    public SearchSubString() {
        this.stringToSearch = "01234567891";
    }
    public String findSubString() {
        var aux = new Random();
        var one = stringToSearch.indexOf(String.valueOf(aux.nextInt(0, 9)));
        var oneLast = stringToSearch.lastIndexOf("1");
        var ten = stringToSearch.indexOf("10");
        return """
                Position on the string:
                position of one: %s
                position of the last one: %s
                position of ten: %s
                """.formatted(one, oneLast, ten);
    }
}
