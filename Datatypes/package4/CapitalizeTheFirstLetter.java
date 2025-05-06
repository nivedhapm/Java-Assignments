package package4;

import java.util.Scanner;

public class CapitalizeTheFirstLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence to capitalize the first letter of each words: ");
		String sentence = scan.nextLine();
		String[] words = sentence.split(" ");
		
		System.out.println("After Capitalizing --> ");
		for(String word:words) {
			word.substring(0,1).toUpperCase();
			System.out.print(word.substring(0,1).toUpperCase()+word.substring(1)+" ");
		}
		scan.close();
	}

}
