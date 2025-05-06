package package5;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter rows of Matrix-1: ");
        int a = scan.nextInt();
        
        System.out.print("Enter columns of Matrix-1 (same as rows of Matrix-2): ");
        int n = scan.nextInt();
        
        System.out.print("Enter columns of Matrix-2: ");
        int m = scan.nextInt();
        
        int[][] matrix1 = new int[a][n];
        int[][] matrix2 = new int[n][m];
        int[][] result = new int[a][m];
		
		System.out.println("Enter elements of matrix-1: ");
		for (int i = 0; i<a; i++) {
			for (int j = 0; j<n; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter elements of matrix-2: ");
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<m; j++) {
				matrix2[i][j] = scan.nextInt();
			}
		}
		System.out.println();
		System.out.println("Resultant Matrix: ");
		for (int i = 0; i<a; i++) {
			for (int j = 0; j<m; j++) {
				for (int k = 0; k<n; k++) {
					result[i][j] += matrix1[i][k]*matrix2[k][j];
				}
				System.out.printf("%-4d", result[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}

}
