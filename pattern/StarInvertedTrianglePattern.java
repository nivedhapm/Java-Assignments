package pattern;

import java.util.Scanner;

public class StarInvertedTrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i>0; i--) {
			System.out.println("x ".repeat(i));
		}
//		for(int i = 0; i<n; i++) {
//			for(int j = n; j>i; j--) {
//				System.out.print("x ");
//			}
//			System.out.println();
//		}
		sc.close();
	}

}
