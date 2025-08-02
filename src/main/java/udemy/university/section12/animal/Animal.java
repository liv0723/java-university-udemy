package udemy.university.section12.animal;

import java.util.Random;

public class Animal {

    public void eat() {
        System.out.println("Eating ....");
    }

    protected void sleep() {
        System.out.println("Sleeping .....");
    }
}

class Dog extends Animal{

    public void doSound() {
        System.out.println("Woau Woau");
    }
     @Override
    protected void sleep() {
        var random = new Random();
        System.out.println("Dog sleeping %d hour ....".formatted(random.nextInt(1, 8)));
        super.sleep();
    }

}

class Cat extends Animal {
    public void doSound() {
        System.out.println("Miau Miau");
    }

    @Override
    public void eat() {
        var random = new Random();
        System.out.println("Cat eating %d kg".formatted(random.nextInt(1, 10)));
        super.eat();
    }

}

class TestAnimal {

    public static void main(String[] args) {
        var animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println();

        var dog = new Dog();
        dog.doSound();
        dog.eat();
        dog.sleep();
        System.out.println();

        Cat cat = new Cat();
        cat.doSound();
        cat.sleep();
        cat.eat();


    }
}
