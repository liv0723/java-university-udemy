package udemy.university.section12.sales;

public class TestProduct {

    public static void main(String[] args ) {
        Product product1 = new Product("zapato", 88.8);
        System.out.println(product1.toString());
        Product product2 = new Product("panatlon", 99.8);
        System.out.println(product2.toString());
    }
}
