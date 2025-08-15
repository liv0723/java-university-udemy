package udemy.university.pattern.creationals.factory;

public class Person {
    public static Person person;
    public static int count;
    private String name;
    private int age;

    private Person() {}

    public static Person getPerson(String name, int age) {
        if (Person.person == null) {
            person = new Person();
            person.setName(name);
            person.setAge(age);
            Person.count++;
        }
        return Person.person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Menu {
    public static void main(String[] args) {
        Person person1 = Person.getPerson("juan", 18);
        System.out.println("""
                name: %s
                age: %d
                count: %d
                """.formatted(person1.getName(), person1.getAge(), Person.count));

        Person person2 = Person.getPerson("Jose", 33);
        System.out.println("""
                name: %s
                age: %d
                count: %d
                """.formatted(person2.getName(), person2.getAge(), Person.count));
    }
}
