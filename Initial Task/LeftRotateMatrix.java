package pack1;

import java.util.Arrays;

public class LeftRotateMatrix {
    
    public static void leftShift(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int first = matrix[i][0];
            for (int j = 0; j < matrix[i].length - 1; j++) {
                matrix[i][j] = matrix[i][j + 1]; 
            }
            matrix[i][matrix[i].length - 1] = first; 
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        leftShift(matrix);

        System.out.println("\nLeft Shifted Matrix:");
        printMatrix(matrix);
    }
}
