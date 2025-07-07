package udemy.university.section3;

public class VarVariable {

    public String toString() {
        final var name = "pepe";
        var age = 12;
        var isMarried = true;
        var salary = 1000.000;

        return """
                name : %s
                age: %d
                is married: %b
                salary: %f
                """.formatted(name, age, isMarried, salary);
    }
}
