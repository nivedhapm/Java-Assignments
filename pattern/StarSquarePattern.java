package pattern;

import java.util.Scanner;

public class StarSquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("x ".repeat(n));
		}
		sc.close();
	}

}
