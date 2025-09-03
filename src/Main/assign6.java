package Main;

class Demo {

    int number = 50;

    void display() {
        
        int number = 100;

        System.out.println("Local variable number = " + number);

     
        System.out.println("Instance variable number = " + this.number);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}
