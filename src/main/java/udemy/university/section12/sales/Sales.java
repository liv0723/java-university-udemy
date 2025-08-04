package udemy.university.section12.sales;

import java.util.Arrays;
import java.util.Random;

public class Sales {

    private static int saleCount;
    private int saleId;
    private static final int MAX_PRODUCTS = new Random().nextInt(5, 10);
    private Product[] products;
    private int countProducts;

    public Sales() {
        this.saleId = ++Sales.saleCount;
        products = new Product[Sales.MAX_PRODUCTS];
    }


    public void addProduct(Product product) {
        if (this.countProducts < Sales.MAX_PRODUCTS)
            this.products[this.countProducts++] = product;
        else
            System.out.println("The quantity of product are final");
    }

    public String total() {
        var sumTotal = 0.0;

        for (int i = 0; i < this.countProducts; i++) {
            sumTotal += products[i].getProductPrice();
        }
        return """
                Total: %f
                """.formatted(sumTotal);
    }

    public void showSales() {
        var total = this.total();
        String productsLocal = "";

        for (int i = 0; i < this.countProducts; i ++) {
            productsLocal += (this.products[i].toString() + "\n");
        }
        System.out.println("""
                Products : \n %s
                Total: %s
                """.formatted(productsLocal, this.total()));

    }

    @Override
    public String toString() {
        return "Sales{" +
                "saleId=" + saleId +
                ", MAX_PRODUCTS=" + MAX_PRODUCTS +
                ", products=" + Arrays.toString(products) +
                ", countProducts=" + countProducts +
                '}';
    }
}
