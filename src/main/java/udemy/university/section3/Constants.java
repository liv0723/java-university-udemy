package udemy.university.section3;

public class Constants {

    private final String USER_NAME = "Pepe";
    private final int USER_AGE;

    public Constants() {
        this.USER_AGE = 33;
    }
    public String toString() {
        var USER_SALARY = 10000.0000;
        final float USER_HEIGHT;
        USER_HEIGHT = 2.0F;

        return """
                name: %s
                age: %d
                salary: %f
                height: f
                PI: %f
                """.formatted(this.USER_NAME, this.USER_AGE, USER_SALARY, USER_HEIGHT, Math.PI);
    }

}
