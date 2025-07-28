package udemy.university.section8;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private int number;
    private int attempts = 1;
    private boolean flag = false;

    public static void main(String [] args) {
        var random = new Random();
        GuessingGame guessingGame = new GuessingGame();
        guessingGame.number = random.nextInt(0, 10);
        guessingGame.guessingGame();
    }

    public void guessingGame() {
        var scanner = new Scanner(System.in);
        while (!this.flag && (this.attempts <= 5) ) {
            System.out.print("Intro the number %d: ".formatted(this.number));
            var numb = Integer.parseInt(scanner.nextLine());
            if (this.number == numb) {
                this.flag = true;
                System.out.println("the Number was: %d and the attempts: %d".formatted(this.number, this.attempts));
            } else {
                this.attempts++;
            }
        }

    }
}
