package Assignment;

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}

public class p4 {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 79999);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14 Pro", 129999);

        System.out.println("=== Mobile 1 ===");
        phone1.displayDetails();

        System.out.println("\n=== Mobile 2 ===");
        phone2.displayDetails();
    }
}
