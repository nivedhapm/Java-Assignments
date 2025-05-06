package test;

public class ZigZagStringConversion {

	public static void main(String[] args) {
		String str = "ZSGRADUATESTUDIES";
		int numRows = 4;
		char[][] zigZag = new char[numRows][str.length()];
		
		int row =0, col = 0;
		boolean down = true;
		for (int i = 0; i < str.length(); i++) {
			zigZag[row][col] = str.charAt(i);
			if (row == numRows - 1) {
				down = false;
				col++;
			}
			else if (row == 0) down = true;
			if(down) {
				row++;
			}else {
				row--;
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<numRows; i++) {
			for(int j = 0; j<str.length(); j++) {
				if(Character.isLetter(zigZag[i][j])) {
					result.append(zigZag[i][j]);
				}
			}
		}
		System.out.println(result.toString());
	}

}
