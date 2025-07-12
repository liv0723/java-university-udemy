package udemy.university.section5;

import java.util.Random;

public class RandomClass {
    public String generateNumber() {
        Random random = new Random();

        var intNumber = random.nextInt(10);
        var doubleNumber = random.nextDouble(0, 1);
        var booleanNumber = random.nextBoolean();

        return """
                Random Numbers
                int: %d
                double: %.1f
                boolean: %b 
                """.formatted(intNumber, doubleNumber, booleanNumber);
    }
    public String throwDice() {
        Random random = new Random();
        var number = random.nextInt(1, 7);
        return """
                Throw Dice
                number: %d
                """.formatted(number);
    }
}
