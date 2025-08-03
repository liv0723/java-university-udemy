package udemy.university.section12.person;

public class Person {
    private static int personCount = 0;
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
                \t\t\tId: %d
                \t\t\tName: %s
                \t\t\tAge: %d
                \t\t\tCount Person: %d
                """.formatted(this.personId, this.personName, this.personAge, Person.personCount);
    }

    public static int getPersonCount() {
        return Person.personCount;
    }
}

class Test {

    public static void main(String[] args) {
        System.out.println(Person.getPersonCount());
        Person person1 = new Person("pepe", 88);
        System.out.println(person1.toString());

        System.out.println(Person.getPersonCount());
        Person person2 = new Person("Maria", 55);
        System.out.println(person2.toString());

        System.out.println(Person.getPersonCount());

    }
}
