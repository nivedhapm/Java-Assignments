import java.util.Arrays;

public class AlternateSorting {

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5,6,7};
		int n = inputArray.length;
		int[] outputArray = new int[n];

		Arrays.sort(inputArray);
		
		int left=0, right=n-1;
		int index=0;
		
		while (left<=right) {
			if( index % 2 == 0 ) {
				outputArray[index] = inputArray[right--];
			}else {
				outputArray[index] = inputArray[left++];
			}
			index++;
		}
		System.out.println(Arrays.toString(outputArray));
	}

}
