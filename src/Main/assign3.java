package Main;

class Car2{
    String model;
    int year;
    static int numberOfCars = 0;

    Car2(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

public class assign3 {
    public static void main(String[] args) {
        Car2 car1 = new Car2("BMW", 2000);
        Car2 car2 = new Car2("TOYOTA", 2020);

        car1.display();
        car2.display();

        System.out.println("Total number of cars created: " + Car2.numberOfCars);
    }
}

