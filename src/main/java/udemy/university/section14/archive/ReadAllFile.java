package udemy.university.section14.archive;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllFile {
    public static void main(String[] args) {
        var nameFile = "test.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            System.out.println("Content or file: ");
            lines.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error to read file " + e.getMessage());
            e.printStackTrace();
        }
    }
}
