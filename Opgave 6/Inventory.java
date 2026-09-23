import java.util.ArrayList;

public class Inventory {
    private String playerName;
    private ArrayList<Item> items = new ArrayList<>();
    private int maxCapacity;

    public Inventory(String playerName, int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.playerName = playerName;
    }

    public void addItem(Item item) {
        if (items.size() < this.maxCapacity) {
            items.add(item);
        } else {
            System.out.println("Not enough room in inventory");
        }
    }

    public int getTotalValue() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getValue();
        }
        return sum;
    }

    public ArrayList<Item> findItemsByType(String type) {
        ArrayList<Item> itemsByType = new ArrayList<>();

        for (Item item : items) {
            if (item.getType().equalsIgnoreCase(type)) {
                itemsByType.add(item);
            }
        }
        return itemsByType;
    }

    public void printInventory() {
        System.out.println("=== " + this.playerName + "'s inventory ===");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
