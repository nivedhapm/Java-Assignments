import java.util.Scanner;
public class PrintStringXPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string of odd length: ");
		String input = sc.nextLine();
		int len = input.length();
		
		for(int i = 0; i<len; i++) {
			for (int j = 0; j < len ; j++) {
				if(i==j || i+j==len-1) {
					System.out.print(input.charAt(j));
				}
				else {
					System.out.print(" ");
				}
            }
			System.out.println();
		}
		
		sc.close();
	}

}
