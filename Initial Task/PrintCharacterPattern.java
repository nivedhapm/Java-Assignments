import java.util.Scanner;

public class PrintCharacterPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the character pattern to be printed: ");
		String input = scan.nextLine();
		int n;
		String s="";
		String result = "";
		for (int i=1; i<input.length(); i+=2) {
			n = Character.getNumericValue(input.charAt(i));
			s = String.valueOf(input.charAt(i-1)); 
			result += s.repeat(n);
		}
		System.out.println(result);
		scan.close();
	}

}
