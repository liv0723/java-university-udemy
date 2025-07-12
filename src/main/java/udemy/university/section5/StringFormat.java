package udemy.university.section5;

public class StringFormat {
    public String stringFormat() {
        var name = "Matias";
        var age = 33;
        var salary = 21000.0000;

        var message = String.format("Name: %s\nage: %d\nsalary: %f", name, age, salary);
        System.out.printf("Int: %d,\nString: %s\nDouble: %.1f\n", 9, "pepe", 2000.00000);
        return message;
    }
}
