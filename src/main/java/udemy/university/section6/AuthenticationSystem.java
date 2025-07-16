package udemy.university.section6;

import java.util.Scanner;

public class AuthenticationSystem {
    private final String USER = "pepe";
    private final String PASS = "pepe";
    private String user;
    private String pass;

    public AuthenticationSystem() {
        getData();
    }

    public void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("intro the user: ");
        this.user = scanner.nextLine();

        System.out.print("Intro the pass: ");
        this.pass = scanner.nextLine();
    }

    public String toString() {
        var isLogged = (this.user.equals(USER) && this.pass.equals(PASS));

        return """
                Authentication System
                use: %s
                pass: %s
                is logged: %b
                """.formatted(this.user, this.pass, isLogged);
    }
}
