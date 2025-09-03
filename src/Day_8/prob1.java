package Day_8;

import java.util.Random;
import java.util.Scanner;

public class prob1 {

   
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    
    public static String getFeedback(Scanner sc, int guess) {
        System.out.print("Is " + guess + " too High (H), too Low (L), or Correct (C)? ");
        return sc.nextLine().trim().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it!");
        System.out.println("Respond with: H (too high), L (too low), C (correct).");

        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(sc, guess);

            switch (feedback) {
                case "H": 
                    high = guess - 1;
                    break;
                case "L": 
                    low = guess + 1;
                    break;
                case "C": 
                    System.out.println("Yay! The computer guessed your number: " + guess);
                    found = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter H, L, or C.");
            }
        }

        if (!found) {
            System.out.println("Seems like there was a mistake in feedback. Try again!");
        }

        sc.close();
    }
}
