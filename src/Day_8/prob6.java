package Day_8;

import java.util.Scanner;

public class prob6 {

    public static int getInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = getInput(sc);

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(num);
            displayResult(num, result);
        }

        sc.close();
    }
}
