package package4;

import java.util.Scanner;

public class ReverseTheWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence to reverse its words: ");
		String sentence = scan.nextLine();
		String[] words = sentence.split(" ");

		System.out.print("The sentence after reversing the words: ");
		for (int i = words.length-1; i>=0 ; i--) {
			System.out.print(words[i]+" ");
		}
		scan.close();
	}

}
