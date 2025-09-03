package Day_8;

import java.util.Scanner;

public class prob5 {

    public static String getInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + str + "\" is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = getInput(sc);
        boolean result = isPalindrome(input);
        displayResult(input, result);
        sc.close();
    }
}
