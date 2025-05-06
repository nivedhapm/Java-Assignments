package test;
import java.util.Scanner;

public class TextToKeypadDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.print("Equivalent digit representation: ");
		System.out.println(digitsRepresentation(str));
		sc.close();
	}

	public static String digitsRepresentation(String str) {
		str = str.toUpperCase();
		int[] digits = {2,22,222,3,33,333,4,44,444,5,55,555,6,66,666,7,77,777,7777,8,88,888,9,99,999,9999};
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				int index = str.charAt(i) - 'A';
				result.append(digits[index]);
			}			
		}
		return result.toString();
	}
}

