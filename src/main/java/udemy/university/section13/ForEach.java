package udemy.university.section13;

public class ForEach {

    public static void main(String[] args) {
        int[] ages = {5, 6, 7, 3};
        var sumAges = 0;

        for (int item : ages) {
            sumAges += item;
        }

        System.out.println(String.format("Sum ages: %d", sumAges));
    }
}
