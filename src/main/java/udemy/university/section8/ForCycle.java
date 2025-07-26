package udemy.university.section8;

public class ForCycle {

    public static void main(String [] args) {
        printNumber();
        pair();

    }

    public static void printNumber() {
        for (var i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void pair() {
        for (var i = 0; i <= 20; i++) {
            var msg =(i % 2 == 0)? (i + " is pair") :(i + " is impair");
            System.out.println(msg);

        }
    }


}
