package package5;

import java.util.Scanner;

public class NxNSpiralMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter dimension of Matrix: ");
        int n = scan.nextInt();
        
        int top = 0, left = 0,dir = 0, value = 1;
        int bottom = n-1, right = n-1;
        int[][] spiral = new int[n][n]; 
        
        while(top<=bottom && left<=right) {
        	if(dir==0) {
        		for(int i = left; i<=right; i++) {
        			spiral[top][i] = value++;
        		}
        		top++;
        	}
        	else if(dir==1) {
        		for(int i = top; i<=bottom; i++) {
        			spiral[i][right] = value++;
        		}
        		right--;
        	}
        	else if(dir==2) {
        		for(int i = right; i>=left; i--) {
        			spiral[bottom][i] = value++;
        		}
        		bottom--;
        	}
        	else if(dir==3) {
        		for(int i = bottom; i>=top; i--) {
        			spiral[i][left] = value++;
        		}
        		left++;
        	}
        	dir = (dir+1)%4;
        }
        
        System.out.println("Spiral Matrix:");
        for (int[] row : spiral) {
            for (int val : row)
                System.out.printf("%-4d", val);
            System.out.println();
        }
        scan.close();

	}

}
