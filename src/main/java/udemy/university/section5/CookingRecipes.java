package udemy.university.section5;

import java.util.Scanner;

public class CookingRecipes {
    private String name;
    private String ingredients;
    private double time;
    private String difficulty;

    public CookingRecipes() {
        getData();

    }
    public void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the Recipes name: ");
        this.name = scanner.nextLine();
        System.out.print("Intro the ingredients (separated by ' '): ");
        this.ingredients = scanner.nextLine();
        System.out.print("Intro the time of cooking: ");
        this.time = Double.parseDouble(scanner.nextLine());
        System.out.print("Intro the difficulty (easy, media, hard): ");
        this.difficulty = scanner.nextLine();

    }
    public String toString() {
        var formatedIngredients = this.ingredients.replace(" ", "\n\t\t\t\t");

        return """
                \t\t\tCooking Recipes
                Cooking name: %s
                Ingredients: %s
                Time: %f
                Difficulty: %s
                """.formatted(this.name, formatedIngredients, this.time, this.difficulty);
    }

}
