import java.util.Scanner;

public class PrintAlphabetC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for pattern printing: ");
		int n = sc.nextInt();
		String star = "*";
		for (int i = 1; i<=n ; i++) {
			if(i==1 || i==n) {
				System.out.print(star.repeat(n));
			}else {
				System.out.print(star);
			}
			System.out.println();
		}
		sc.close();

	}

}
