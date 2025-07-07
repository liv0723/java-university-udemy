package udemy.university.section3;

public class StringConcatenation {

    public String toString() {
        var name = "Jesus";
        var lastname = " \tLopez";
        var age = 55;

        var nameComplete = name + lastname;

        return nameComplete.concat("\t" + String.valueOf(age));

    }
}
