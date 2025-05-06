import java.util.Scanner;

public class IndexOfSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string1: ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter string2: ");
		String str2 = sc.nextLine();
		
		if(str1.contains(str1)) {
			System.out.println(str1.indexOf(str2));
		}else 
			System.out.println(-1);
		sc.close();
	}

}
