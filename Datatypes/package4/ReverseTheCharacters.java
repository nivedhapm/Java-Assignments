package package4;
import java.util.Scanner;

public class ReverseTheCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string to be reversed: ");
		String str = scan.nextLine();
		String result = "";
		for (int i = str.length()-1; i>=0 ; i--) {
			result += str.charAt(i);
		}
		System.out.println("The string after reversing the characters: "+ result);
		scan.close();
	}

}
