
public class ReverseNumberPyramidPattern {

	public static void main(String[] args) {
		int n = 9;
		
		System.out.println();
		for (int i = 0; i<=n; i++) {
			int pattern = n;
			int spaces = i;
			
			for(int j = 0; j<=spaces; j++) {
				System.out.print(" ");
			}
			pattern-=i;
			for (int j = 0; j<pattern ; j++) {
				System.out.print(pattern + " ");
			}
			
			System.out.println();
		}

	}

}
