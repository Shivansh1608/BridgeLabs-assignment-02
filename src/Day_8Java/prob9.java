import java.util.Scanner;

public class prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                maxChar = (char) i;
            }
        }
        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}
