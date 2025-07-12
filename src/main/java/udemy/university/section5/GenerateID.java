package udemy.university.section5;

import java.util.Random;
import java.util.Scanner;

public class GenerateID {
    private String name;
    private String lastName;
    private String bornYear;
    private String numberAleatory;

    public GenerateID() {
        getData();
        normalizeData();
    }
    public  void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the name: ");
        this.name = scanner.nextLine();
        System.out.print("Intro the last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Intro the year: ");
        this.bornYear = scanner.nextLine();

    }

    public void normalizeData() {
        var random = new Random();
        var number = random.nextInt(9999) + 1;

        this.name = this.name.strip().toUpperCase().substring(0, 3);
        this.lastName = this.lastName.strip().toUpperCase().substring(0, 3);
        this.bornYear = this.bornYear.strip().substring(2,4);
        this.numberAleatory = String.format("%04d", number);

    }

    public String toString() {
        var id = this.name + this.lastName + this.bornYear + this.numberAleatory;
        return """
                \t\t\t\t\t\tId Generated
                id: %s
                """.formatted(id);
    }





}
