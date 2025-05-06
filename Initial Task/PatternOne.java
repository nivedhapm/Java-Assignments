
public class PatternOne {

	public static void main(String[] args) {

		int n = 9;
		for (int i = 1; i<=n; i++) {
			int pattern = (2*i)-1;
			int spaces = (2*n)-(2*i);
			
			for(int j = 0; j<spaces; j++) {
				System.out.print(" ");
			}
			
			int val = 1;
			boolean flag = true;
			for (int j = 0; j<pattern ; j++) {
				if (val<i && flag){
					System.out.print(val++ + " ");
				}
				else {
					System.out.print(val-- + " ");
					flag = false;
				}
			}
			System.out.println();
		}
	}

}
