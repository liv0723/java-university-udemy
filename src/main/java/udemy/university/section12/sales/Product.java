package udemy.university.section12.sales;

public class Product {
    private static int productCount ;
    private final int productId;
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        this.productId = ++Product.productCount;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public int getProductCount() {
        return Product.productCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
