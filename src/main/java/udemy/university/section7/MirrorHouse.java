package udemy.university.section7;

import java.util.Scanner;

public class MirrorHouse {
    private int age;
    private boolean notHasFear;

    public MirrorHouse() {
        getData();
    }

    public void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the age: ");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.print("intro if you not have fear (true/false): ");
        this.notHasFear = Boolean.parseBoolean(scanner.nextLine());
    }

    public String toString() {
        if(this.age < 18 || !this.notHasFear) {
            return """
                    Mirror House
                    you do not get intro in the Mirror House
                    """;
        }
        else {
            return """
                    Mirror House
                    you get intro in the Mirror House
                    """;
        }
    }
}
