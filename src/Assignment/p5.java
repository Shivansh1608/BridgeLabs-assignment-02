package Assignment;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class p5 {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Circle c2 = new Circle(10);

        System.out.println("=== Circle 1 ===");
        c1.displayDetails();

        System.out.println("\n=== Circle 2 ===");
        c2.displayDetails();
    }
}
