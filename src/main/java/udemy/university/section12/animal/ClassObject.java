package udemy.university.section12.animal;

public class ClassObject {

    private String name;
    private int age;

    public ClassObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return """
                name: %s
                age: %d
                address memory: %s
                """.formatted(this.name, this.age, super.toString());
    }
}

class Test {

    public static void main(String[] args) {
        ClassObject classObject = new ClassObject("pepe", 4);
        System.out.println(classObject);
    }
}
