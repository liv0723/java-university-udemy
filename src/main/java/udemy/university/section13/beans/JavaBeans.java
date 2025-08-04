package udemy.university.section13.beans;

import java.io.Serializable;

public class JavaBeans {

    public static void main(String[] args) {

        var person = new Person();
        person.setName("Pepe");
        person.setLastName("Rodriguez");
        System.out.println(person.toString());

        var animal = new Animal();
        animal.setRaza("Dog");
        animal.setHeight(1.2);
        animal.setWeight(44.5);
        System.out.println(animal.toString());

        var table = new Table();
        table.setColor("Red");
        table.setMark("Pioner");
        System.out.println(table.toString());
    }
}

class Person implements Serializable {

    private String name;
    private String lastName;

    public Person() {}

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class Animal implements Serializable{

    private String raza;
    private double height;
    private double weight;

    public Animal() {}

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "raza='" + raza + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

class Table implements Serializable {

    private String mark;
    private String color;

    public Table() {}

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table{" +
                "mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
