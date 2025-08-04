package udemy.university.section12.sales;

public class TestSales {

    public static void main(String[] args) {
        Product product1 = new Product("zapato", 88.8);
        Product product2 = new Product("ropa", 99.9);
        Sales sales = new Sales();
        sales.addProduct(product1);
        sales.addProduct(product2);
        System.out.println(sales.total());
        sales.showSales();
        //System.out.println(sales.toString());

    }
}
