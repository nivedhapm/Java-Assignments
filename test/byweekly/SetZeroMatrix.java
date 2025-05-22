package test.byweekly;

public class SetZeroMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		
		int n = matrix.length;
		int m = matrix[0].length;
		boolean[] zeroRow = new boolean[n];
		boolean[] zeroCol = new boolean[m];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(matrix[i][j]==0) {
					zeroRow[i] = true;
					zeroCol[j] = true;
				}
			}
		}
		
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[0].length; j++) {
				if(zeroRow[i] || zeroCol[j]) {
					matrix[i][j]=0;
				}
				System.out.println(matrix[i][j]);
			}
			System.out.println();
		}		

	}

}
