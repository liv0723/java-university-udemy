package udemy.university.section2;

public class PresentJava {
    private String name;
    private int age;
    private String country;

    public PresentJava() {
        this.name = "Yan";
        this.age = 36;
        this.country = """
                Cuba
                """;
    }

    public String getName() {
        return  this.name;
    }
    public  int getAge() {
        return this.age;
    }
    public String getCountry() {
        return this.country;
    }

}
