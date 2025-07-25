package udemy.university.section7;

import java.util.Scanner;

public class GradingSystem {
    private final int qualification;

    public GradingSystem() {
        var scanner = new Scanner(System.in);
        System.out.print("Intro the qualification: ");
        this.qualification = Integer.parseInt(scanner.nextLine());
    }

    public String toString() {
        var letterQualification = "";

        if (this.qualification >= 9 && this.qualification <=10) {
            letterQualification = "A";
        } else if (this.qualification >= 8 && this.qualification < 9) {
            letterQualification = "B";
        } else if (this.qualification >=6 && this.qualification < 7) {
            letterQualification = "C";
        } else if (this.qualification >= 5 && this.qualification < 6) {
            letterQualification = "D";
        } else {
            letterQualification = "F";
        }

        return """
                The qualification was
                %d : %s
                """.formatted(this.qualification, letterQualification);
    }


}
