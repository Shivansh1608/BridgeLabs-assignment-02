package Main;

//This Java program defines a Car class with attributes model and year.
class Car {
 String model;
 int year;

 
 Car(String model, int year) {
     this.model = model;
     this.year = year;
 }

 
 void display() {
     System.out.println("Car Model: " + model + ", Year: " + year);
 }
}

public class assign1 {
 public static void main(String[] args) {
  
     Car car1 = new Car("BMW", 2000);
     Car car2 = new Car("TOYOTA", 2020);

  
     car1.display();
     car2.display();
 }
}

