package udemy.university.section3;
import java.util.Random;

public class PersonDetails {

    private final String name;
    private int age;
    private float height;
    private final String country;
    private char isMarried;

    public PersonDetails() {
        this.name = "pepe";
        this.age = new Random().nextInt(0, 120);
        this.height = new Random().nextFloat(1, 2);
        this.country = "Cuba";
        this.isMarried = generate();
    }

    public char generate() {
        boolean aux = new Random().nextBoolean();
        if(aux == true) {
            return 'C';
        } else {
            return 'S';
        }
    }

    public String getName() {
        return this.name;
    }

    public  int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }

    public String getCountry() {
        return this.country;
    }

    public char getIsMarried() {
        return this.isMarried;
    }


}
