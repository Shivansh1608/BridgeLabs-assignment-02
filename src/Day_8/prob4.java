package Day_8;

import java.util.Scanner;

public class prob4 {

    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        if (n > 0) {
            generateFibonacci(n);
        } else {
            System.out.println("Please enter a positive number of terms.");
        }
        sc.close();
    }
}
