package Day_8;

import java.util.Scanner;

public class prob7 {

    public static int getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":");
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = getInput(sc, "Enter first number: ");
        int num2 = getInput(sc, "Enter second number: ");

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        displayResult(num1, num2, gcd, lcm);

        sc.close();
    }
}
