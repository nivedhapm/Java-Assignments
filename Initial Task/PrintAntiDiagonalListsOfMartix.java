
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class PrintAntiDiagonalListsOfMartix {

	public static List<List<Integer>> printAntiDiagonal(int[][] matrix){
		int n = matrix.length;
		List<List<Integer>> result = new ArrayList<>();
		
		for(int ud = 0; ud<n; ud++) {
			List<Integer> diagonal = new ArrayList<>();
			int i = 0, j = ud;
			while(i<n && j>=0) {
				diagonal.add(matrix[i][j]);
				i++;
				j--;
			}
			result.add(diagonal);
		}
		
		for(int ld = 1; ld<n; ld++) {
			List<Integer> diagonal = new ArrayList<>();
			int i = ld, j = n - 1;
			while(i<n && j>=0) {
				diagonal.add(matrix[i][j]);
				i++;
				j--;
			}
			result.add(diagonal);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dimension of the square matrix: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		int[][] matrix = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				matrix[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("The square matrix: ");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(matrix[i][j]+ " "); 
			}
			System.out.println();
		}
		System.out.println("AntiDiagonals of the matrix: ");
        System.out.println(printAntiDiagonal(matrix));
        
        sc.close();
	}

}
