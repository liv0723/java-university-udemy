package udemy.university.section6;

import java.util.Scanner;

public class Rectangle {
    private double area;
    private double perimeter;
    private double large;
    private double broad;

    public Rectangle() {
        getData();
    }

    public void getData() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the large of rectangle: ");
        this.large = Double.parseDouble(scanner.nextLine());
        System.out.print("Intro the broad of rectangle: ");
        this.broad = Double.parseDouble(scanner.nextLine());
    }

    public String toString() {
        this.area =(this.large * this.broad);
        this.perimeter = (this.large + this.broad) * 2;
        return String.format("""
                Area of rectangle: %.0f
                Perimeter of rectangle: %.0f
                """, this.area, this.perimeter);
    }
}
