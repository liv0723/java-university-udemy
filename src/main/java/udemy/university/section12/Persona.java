package udemy.university.section12;

public class Persona {
    private String name;
    private String lastName;
    private int age;

    public Persona(String name,String lastName, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        var persona = new Persona("pepe", "Morales", 33);
        persona.showPerson();
    }

    public void showPerson() {
        System.out.println("""
                name: %s
                lastname: %s
                age: %d
                """.formatted(name, lastName, age));
    }

}
