
public class PrintDuplicateElements {

	public static void main(String[] args) {
		int[] inputArray = {1,3,4,5,1,3,6,7,4,0,4};
		int[] freq = new int[inputArray.length];
		System.out.print("Duplicate elements: ");	
		for (int num: inputArray) {
			freq[num]++;
			if(freq[num]==2) {
				System.out.print(num+ " ");
			}
		}
	}

}
