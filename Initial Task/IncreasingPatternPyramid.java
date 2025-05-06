import java.util.Scanner;
public class IncreasingPatternPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print increasing pattern pyramid: ");
		int n = sc.nextInt();
		int val = 1;
		for (int i = 1; i<=n; i++) {
			for(int j = 0; j<n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++) {
				if(val<=n)
				System.out.print(val++ +" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
