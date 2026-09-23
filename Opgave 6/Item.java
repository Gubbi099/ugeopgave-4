public class Item {
    private String name;
    private int value;
    private String type;

    private static int totalItems = 0;

    public Item(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;

        totalItems++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getTotalItems() {
        return totalItems;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Value: " + this.value + " Type: " + this.type;
    }
}
