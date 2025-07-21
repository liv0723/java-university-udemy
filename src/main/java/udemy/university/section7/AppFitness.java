package udemy.university.section7;

import java.awt.*;
import java.util.Scanner;

public class AppFitness {
    private static final int GOAL_DIARY_STEPS = 1000;
    private static final float CALORIES_BY_STEPS = 0.04F;
    private String name;

    public AppFitness() {

    }

    public String toString() {
        var scanner = new Scanner(System.in);

        System.out.println("Intro the name: ");
        this.name = scanner.nextLine();
        System.out.print("Intro the diary steps: ");
        var stepsDiary = Integer.parseInt(scanner.nextLine());

        var calories = stepsDiary * AppFitness.CALORIES_BY_STEPS;

        var meta = (stepsDiary >= AppFitness.GOAL_DIARY_STEPS) ? true : false;

        return """
                App Fitness
                name: %s
                Steps diary: %d
                calories expended: %.2f
                goal archived: %b
                """.formatted(this.name, stepsDiary, calories, meta);
    }
}
