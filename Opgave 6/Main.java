public class Main {

    public static void main(String[] args) {
        Inventory inventory1 = new Inventory("Jeff", 10);
        Inventory inventory2 = new Inventory("Knud", 10);

        Item item1 = new Item("Sword", 10,  "Weapon");
        Item item2 = new Item("Wand", 20, "Weapon");
        Item item3 = new Item("Potion", 5, "Useable");

        inventory1.addItem(item1);
        inventory1.addItem(item3);

        inventory2.addItem(item2);
        inventory2.addItem(item3);

        inventory1.printInventory();
        System.out.println("Total value: " + inventory1.getTotalValue());

        inventory2.printInventory();
        System.out.println("Total value: " + inventory2.getTotalValue());


        System.out.println("Total items: " + Item.getTotalItems());

    }
}
