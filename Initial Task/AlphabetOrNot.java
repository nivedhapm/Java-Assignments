
import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char character = scan.next().charAt(0);
		if (character>='A' && character<='z') {
			System.out.println("The character "+ character+ " is a Alphabet.");
		}else {
			System.out.println("The character "+ character+ " is not a Alphabet.");
		}
		scan.close();
	}

}
