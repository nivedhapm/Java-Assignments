package package4;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string to find the count of vowels in it: ");
		String str = scan.nextLine().toLowerCase();		
		int countVowels = 0;
		
		for (int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				countVowels++;
			}
		}
		System.out.println("The count of vowels in the given string = "+ countVowels);
		scan.close();
	}

}
