package udemy.university.section3;
import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;

public class BookDetails {
    private final String name;
    private final int year;
    private boolean isAvailableSale;
    private final double price;

    public BookDetails() {
        this.name = "Lord of the ring";
        this.year = 2000;
        this.price = 500.00;
        this.isAvailableSale = generateIsAvailable();
    }

    public boolean generateIsAvailable() {
        int random = new Random().nextInt(0, 10);

        if(random > 5) {
            return true;
        } else {
            return false;
        }

    }

    public String getName() {
        return  this.name;
    }
    public int getYear() {
        return this.year;
    }
    public boolean getIsAvailableSale() {
        return this.isAvailableSale;
    }
    public double getPrice() {
        return this.price;
    }
}
