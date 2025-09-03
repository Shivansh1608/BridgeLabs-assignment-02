package Assignment;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
    }
}

public class p3 {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 55000);
        Item item2 = new Item(102, "Headphones", 2500);

        System.out.println("=== Item 1 ===");
        item1.displayDetails();
        System.out.println("Total Cost (for 2 units): ₹" + item1.calculateTotalCost(2));

        System.out.println("\n=== Item 2 ===");
        item2.displayDetails();
        System.out.println("Total Cost (for 3 units): ₹" + item2.calculateTotalCost(3));
    }
}
