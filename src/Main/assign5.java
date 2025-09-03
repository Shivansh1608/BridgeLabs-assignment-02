package Main;

class Counter {
    // static variable shared among all objects
    static int count = 0;

    // method to display the current count
    void display() {
        System.out.println("Count = " + count);
    }
}

public class assign5 {
    public static void main(String[] args) {
        // create first object
        Counter obj1 = new Counter();
        obj1.count = 5;   // modify static variable using obj1
        obj1.display();

        // create second object
        Counter obj2 = new Counter();
        obj2.display();   // obj2 also sees the updated value (5)

        // modify again using obj2
        obj2.count = 10;
        obj1.display();   // obj1 also sees updated value (10)
        obj2.display();
    }
}
