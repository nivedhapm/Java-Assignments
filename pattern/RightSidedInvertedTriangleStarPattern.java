package pattern;

import java.util.Scanner;

public class RightSidedInvertedTriangleStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//method 1
//		for(int i = n; i>0; i--) {
//			System.out.print("  ".repeat(n-i));
//			System.out.print("x ".repeat(i));
//			System.out.println();
//		}
		
		//method 2
		for(int i = n; i>0; i--) {
			for(int j = 0; j<n-i; j++) {
				System.out.print("  ");
			}	
			for(int k = i; k>0; k--) {
				System.out.print("x ");
			}		
			System.out.println();
		}		
		sc.close();
	}

}
