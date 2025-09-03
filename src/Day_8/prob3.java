package Day_8;

import java.util.Scanner;

public class prob3 {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0, 1, and negatives are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // check till sqrt(n)
            if (n % i == 0) {
                return false; // divisible by i → not prime
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number to check if it's prime: ");
        int num = sc.nextInt();

        // Check and display result
        if (isPrime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }

        sc.close();
    }
}
