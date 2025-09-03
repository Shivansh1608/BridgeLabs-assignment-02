package Main;

class FinalVariableDemo {
    final int value = 100;

    void changeValue() {

        System.out.println("Value = " + value);
    }

    public static void main(String[] args) {
        FinalVariableDemo obj = new FinalVariableDemo();
        obj.changeValue();
    }
}
