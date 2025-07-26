package udemy.university.section8;

import java.util.Scanner;

public class IterativeMenu {

    public static void main(String [] args) {
        iterativeMenu();
    }

    public static  void iterativeMenu() {
        var out = false;
        var scanner = new Scanner(System.in);

        while ( !out) {
            System.out.print("""
                    Intro the option
                    Create account 1:
                    Deleting account 2:
                    exit of menu 3: 
                    Intro the option:  
                    """);
            var option = Integer.parseInt(scanner.nextLine());
            var msg = switch (option) {
                case 1 -> "Creating account ...";
                case 2 -> "Deleting account ...";
                default -> {
                    out = true;
                    yield "exit ...";
                }
            };
            System.out.println(msg);
        }
    }
}
