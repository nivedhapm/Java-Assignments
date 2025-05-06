
public class PrintStarPyramidPattern {

	public static void main(String[] args) {
		int n = 9;
	
		System.out.println();
		for (int i = 0; i<=n; i++) {
			int pattern = n;
			int spaces = i;
			
			for(int j = 0; j<=spaces; j++) {
				System.out.print(" ");
			}
		
			for (int j = 0; j<pattern-i ; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
