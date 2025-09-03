import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char remove = sc.next().charAt(0);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove) result.append(str.charAt(i));
        }
        System.out.println("Modified String: " + result);
    }
}
