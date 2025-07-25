package udemy.university.section7;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class AuthenticationSystem {

    private final String USER = "pepe";
    private final String PASSWORD = "pepe";
    private String user;
    private String pass;

    public AuthenticationSystem() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the user: ");
        this.user = scanner.nextLine();

        System.out.print("Intro the password: ");
        this.pass = scanner.nextLine();
    }

    public String toString() {
        var msg = "";

        var userNormalize = this.user.toLowerCase().strip();
        var passNormalize = this.pass.toLowerCase().strip();

        if (userNormalize.equals(this.USER) && passNormalize.equals(this.PASSWORD)) {
            msg = "The Authentication was suscefull";
        } else if (!userNormalize.equals(this.USER) && !passNormalize.equals(this.PASSWORD)) {
            msg = "The user and pass are bad";
        } else if (!passNormalize.equals(this.PASSWORD)) {
            msg = "The Pass are bad";
        } else {
            msg = "The user are bad" ;
        }
        return msg;
    }

}
