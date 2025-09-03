package Assignment;

class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}

public class p8 {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        PalindromeChecker p2 = new PalindromeChecker("Hello");

        p1.displayResult();
        System.out.println();
        p2.displayResult();
    }
}
