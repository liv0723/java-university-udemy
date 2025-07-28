package udemy.university.section8;

import java.util.Scanner;

public class Calculator {
    private static final String MENU = """
            ************ Calculator **************
            Options to select:
            1. Sum
            2. Rest
            3. Multi
            4. Div
            5. Out
            """;
    private String selectedOption;
    private double firstValue = 0, secondValue = 0;
    private boolean out = false;

    public static void main(String [] rgs) {
        Calculator calc = new Calculator();
        calc.calculator();

    }

    public void calculator() {
        var scanner = new Scanner(System.in);

        while (!this.out) {
            System.out.println(Calculator.MENU);
            System.out.println("intro the option of menu: ");
            this.selectedOption = scanner.nextLine();
            System.out.print("Intro the first value: ");
            this.firstValue = Double.parseDouble(scanner.nextLine());
            System.out.print("Intro the second value: ");
            this.secondValue = Double.parseDouble(scanner.nextLine());

            switch (this.selectedOption) {
                case "1" -> {
                    System.out.printf("the result of sum is: %f %n%n", (this.firstValue + this.secondValue));
                }
                case "2" -> {
                    System.out.println("The result of rest is: %f".formatted(this.firstValue - this.secondValue));
                }
                case  "3" -> {
                    System.out.println("the result of multi: %f".formatted(this.firstValue * this.secondValue));
                }
                case "4" -> {
                    System.out.println(String.format("The result of div is: ", (this.firstValue / this.secondValue)));
                }
                case "5" -> {
                    this.out = true;
                }
                default -> {
                    System.out.println("the value are bad");
                }
            }

        }


    }

}
