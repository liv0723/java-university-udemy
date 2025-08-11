package udemy.university.section14.archive;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        var append = false;
        var nameFile = "test.txt";
        var file = new File(nameFile);
        var scanner = new Scanner(System.in);
        try {
            append = file.exists();
            var out = new PrintWriter(new FileWriter(file, append));
            System.out.print("Intro the new content: ");
            var newContent = scanner.nextLine();
            System.out.println();
            out.println(newContent);
            out.close();
            System.out.println("the new content was appended ....");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
