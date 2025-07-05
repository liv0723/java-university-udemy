package udemy.university.section3;
import java.util.Random;

public class ChallengerProductDetail {

    private final String productName;
    private double productPrice;
    private int productQuantity;
    private boolean isAvailable;

    public ChallengerProductDetail() {
        this. productName = "Book";
        this.productPrice = 2000.00;
        this.productQuantity = 10;
        this.isAvailable = new Random().nextBoolean();
    }

    public String getProductName() {
        return this.productName;
    }
    public double getProductPrice() {
        return this.productPrice;
    }
    public int getProductQuantity() {
        return this.productQuantity;
    }
    public boolean getIsAvailable() {
        return this.isAvailable;
    }
    public String toString() {
        return """
                product name: %s
                product price: %f
                product quantity: %d
                is available: %b
                """.formatted(this.productName, this.productPrice, this.productQuantity, this.isAvailable);
    }



}
