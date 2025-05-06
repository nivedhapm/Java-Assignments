package package5;
import java.util.Scanner;
public class TransposeOfMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows matrix: ");
		int n = scan.nextInt();
		System.out.print("Enter the number of columns matrix: ");
		int m = scan.nextInt();
		
		System.out.println("Enter the elements of  the matrix: ");
		int[][] array = new int[n][m];
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<m; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("The input array: ");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] transpose = new int[m][n];
		System.out.println();
		System.out.println("The transpose of the input array: ");
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				transpose[i][j] = array[j][i];
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();

	}

}
