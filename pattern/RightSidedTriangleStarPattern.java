package pattern;

import java.util.Scanner;

public class RightSidedTriangleStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//method 1
//		for(int i = n; i>0; i--) {
//			System.out.print("  ".repeat(i-1));
//			System.out.print("x ".repeat(n-i+1));
//			System.out.println();
//		}
		
		//method 2
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				System.out.print("  ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print("x ");
			}
			
			System.out.println();
		}		
		sc.close();
	}

}
