import java.util.Scanner;

public class prob12{
    public static String replace(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.equals(oldWord)) result.append(newWord).append(" ");
            else result.append(word).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();
        System.out.println("Modified Sentence: " + replace(sentence, oldWord, newWord));
    }
}
