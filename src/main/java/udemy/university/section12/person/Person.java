package udemy.university.section12.person;

public class Person {
    public static int personCount = 0;
    private String personName;
    private int personAge;
    private int personId;

    public Person(String name, int age) {
        this.personName = name;
        this.personAge = age;
        this.personId = ++Person.personCount;
    }

    public String  toString() {
        return """
                Id: %d
                Name: %s
                Age: %d
                Count Person: %d
                """.formatted(this.personId, this.personName, this.personAge, Person.personCount);
    }
}

class Menu {

    public static void main(String[] args) {
        Person person1 = new Person("pepe", 88);
        System.out.println(person1.toString());
        Person person2 = new Person("Maria", 55);
        System.out.println(person2.toString());

    }
}
