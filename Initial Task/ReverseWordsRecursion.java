import java.util.Scanner;

public class ReverseWordsRecursion {
    public static String reverseWords(String[] words, int index) {
        if (index < 0) {
            return "";
        }
        return words[index] + (index == 0 ? "" : " ") + reverseWords(words, index - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String reversedSentence = reverseWords(words, words.length - 1);
        System.out.println("Reversed sentence: " + reversedSentence);
        scanner.close();
    }
}