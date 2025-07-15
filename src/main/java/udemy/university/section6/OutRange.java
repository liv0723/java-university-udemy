package udemy.university.section6;

import java.util.Scanner;

public class OutRange {
    private int userRange;
    private static final int INITIAL_RANGE = 0;
    private static final int FINAL_RANGE = 5;

    public OutRange() {
        getData();
    }

    public void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the user range: ");
        this.userRange = Integer.parseInt(scanner.nextLine());

     }

    public String toString() {

        var isRange = (this.userRange >= OutRange.INITIAL_RANGE && this.userRange <= OutRange.FINAL_RANGE);
        var isNotRange = !(this.userRange >= OutRange.INITIAL_RANGE && this.userRange <= OutRange.FINAL_RANGE);

        return String.format("""
                In Range
                variable is in range: %b
                variable is out of range: %b
                """,isRange, isNotRange);
    }
}
