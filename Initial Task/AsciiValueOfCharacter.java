import java.util.Scanner;

public class AsciiValueOfCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char character = scanner.next().charAt(0);
		System.out.println("The Ascii value of "+ character + " is "+ (int)character);
		scanner.close();
	}

}
