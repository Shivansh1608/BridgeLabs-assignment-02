package Main;

class Car1 {
    String model;
    int year;
    static int numberOfCars = 0;

    Car1(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

public class assign2 {
    public static void main(String[] args) {
        Car1 car1 = new Car1("BMW", 2000);
        Car1 car2 = new Car1("TOYOTA", 2020);

        car1.display();
        car2.display();

        System.out.println("Total number of cars created: " + Car1.numberOfCars);
    }
}
