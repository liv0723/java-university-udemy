package udemy.university.section6;

import java.util.Scanner;

public class Library {
    private boolean isStudent;
    private double km;
    private static final double KM_PERMITTED = 3;

    public Library() {
        getData();
    }

    public void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro if is student (true/false): ");
        this.isStudent = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Intro the km to live: ");
        this.km = Double.parseDouble(scanner.nextLine());
    }

    public String toString() {

        var getLoad = (this.isStudent) || (this.km <= Library.KM_PERMITTED);

        return String.format("""
                Library
                is student: %b
                km to live: %.1f
                get a loan: %b
                """,this.isStudent, this.km, getLoad);
    }
}
