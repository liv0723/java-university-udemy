package udemy.university.section14.archive;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args)  {
        System.out.print("Intro the name or archive: ");
        var scanner = new Scanner(System.in);
        var nameArchive = scanner.nextLine();
        var archive = new File(nameArchive);

        try {
            if (archive.exists()) {
                System.out.println("The archive exist");
            } else {
                //create the archive
                var fileOut = new PrintWriter(new FileWriter(archive));
                fileOut.println("Line 1");
                fileOut.println("Line 2");
                fileOut.println("Line 3");
                fileOut.close();
                System.out.println("The archive was create");
            }
        } catch (IOException e) {
            System.out.println("Error to create archive" + e.getMessage());
            e.printStackTrace();
        }


    }
}
