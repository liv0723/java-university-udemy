package udemy.university.section5;

import java.util.Scanner;

public class EmployedSystem {
    private String employedName;
    private int employedAge;
    private double employedSalary;
    private boolean isDepartmentBoss;

    public EmployedSystem() {
        getEmployedInfo();
    }
    public void getEmployedInfo() {
        var scanner = new Scanner(System.in);

        //getting data
        System.out.print("Intro the employed name: ");
        this.employedName = scanner.nextLine();
        System.out.print("Intro the age of employed: ");
        this.employedAge = scanner.nextInt();
        System.out.print("Intro the salary of employed: ");
        this.employedSalary = scanner.nextDouble();
        System.out.print("Intro if is a Department Boss: ");
        this.isDepartmentBoss = scanner.nextBoolean();

    }
    public String toString() {
        return """
                \t\t\t\t\t\t Employed Info
                name: %s
                age: %d
                salary: %.2f
                is Department Boss: %b
                """.formatted(this.employedName, this.employedAge, this.employedSalary, this.isDepartmentBoss);
    }

}
