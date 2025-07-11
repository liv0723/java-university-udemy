package udemy.university.section5;

import java.util.Scanner;

public class ScannerClass {

   public String toString() {
       var scanner = new Scanner(System.in);

       System.out.print("Intro the name: ");
       var name = scanner.nextLine();
       System.out.print("Intro the age: ");
       var age = scanner.nextInt();
       System.out.print("Intro the salary: ");
       var salary = scanner.nextDouble();
       System.out.print("Intro the height: ");
       var height = scanner.nextFloat();
       System.out.println("Intro the address: ");
       scanner.nextLine();
       var address = scanner.nextLine();

       return """
               \n
               Data of User
               name: %s
               age: %d
               salary: %f
               height: %f
               address: %s
               """.formatted(name, age, salary, height, address);
   }
   public String convertDataType() {
       var scanner = new Scanner(System.in);

       var byteType = Byte.parseByte(scanner.nextLine());
       var shortType = Short.parseShort(scanner.nextLine());
       var intType = Integer.parseInt(scanner.nextLine());
       var longType = Long.parseLong(scanner.nextLine());
       var floatType = Float.parseFloat(scanner.nextLine());
       var doubleType = Double.parseDouble(scanner.nextLine());
       var charType = scanner.nextLine().charAt(0);

       return """
               """;
   }

}
