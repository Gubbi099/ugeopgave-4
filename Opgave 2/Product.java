import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private String[] tags;

    private static ArrayList<Product> products = new ArrayList<>();

    public Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;

        products.add(this);
    }

    public void printInfo() {
        StringBuilder tagString = new StringBuilder();
        for (String tag : tags) {
            tagString.append(tag + ", ");
        }

        System.out.println("Name: " + this.name + " Price: " + this.price + " Tags: " + tagString);

        tagString = null;
    }

    public static void printAll(){
        for (Product product : products) {
            product.printInfo();
        }
    }

    public static Product getMostExpensive() {
        Product mostExpensive = products.getFirst();

        for (Product product : products) {
            if (product.price > mostExpensive.price) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
