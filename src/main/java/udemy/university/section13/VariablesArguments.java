package udemy.university.section13;

public class VariablesArguments {
    
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
        manyParameters("pepe", 12, 20, 30);
    }

    private static void manyParameters(String name, int... notes) {
        var newNotes = "";
        for (int i = 0; i < notes.length; i++) {
            newNotes = newNotes.concat("\n" + notes[i]);
        }
        System.out.println("""
                name : %s
                notes: %s
                """.formatted(name, newNotes));
    }

    public static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }


}
