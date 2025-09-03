import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}
