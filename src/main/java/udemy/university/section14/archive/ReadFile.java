package udemy.university.section14.archive;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        readFile();
        readOneLineOfFile();
        workingToReadFile();
    }

    public static void readFile() {
        System.out.print("Intro the name of file to read: ");
        var scanner = new Scanner(System.in);
        var nameFile = scanner.nextLine();
        var file = new File(nameFile);

        try {
            System.out.println("Content of file");
            var intro = new BufferedReader(new FileReader(file));
            var line = intro.readLine();

            while (line != null) {
                System.out.println(line);
                line = intro.readLine();
            }
            intro.close();
            System.out.println("The file was read");

        } catch(Exception e) {
            System.out.println("Error to read the file");
        }

    }

    public static void readOneLineOfFile() {

        try {
            var nameFile = "test.txt";
            var file = new File(nameFile);

            var introFile = new BufferedReader(new FileReader(file));

            System.out.println("Content of first line: %s".formatted(introFile.readLine()));
            introFile.close();
        } catch (Exception e) {
            System.out.println("Error to read the file " + e.getMessage());
        }
    }

    public static void workingToReadFile() {
        try {

        var nameFile = "test.txt";
        var file = new File(nameFile);

        var introFile = new BufferedReader(new FileReader(file));
        System.out.println(introFile.read());
        introFile.close();

    } catch (Exception e) {
            System.out.println("Error to read the file " + e.getMessage());
        }
    }
}
