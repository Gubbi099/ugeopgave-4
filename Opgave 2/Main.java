public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, new String[]{"New", "Electronics", "Sale"});
        Product product2 = new Product("Knife", 1000, new String[]{"New", "Test", "Sale"});
        Product product3 = new Product("Laptop", 1000, new String[]{"New", "Electronics", "Sale"});
        Product product4 = new Product("Laptop", 1000, new String[]{"New", "Jeff", "Sale"});

        Product.printAll();

        Product.getMostExpensive().printInfo();
    }
}
