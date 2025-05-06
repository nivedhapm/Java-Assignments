import java.util.Scanner;
import java.util.Arrays;

public class SortElementsInOddEvenPositions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scan.nextInt();
		System.out.print("Enter the elements to be sorted: ");
		int[] inputArray = new int[n];
		for (int i=0; i<n; i++) {
			inputArray[i]=scan.nextInt();
		}
		int oddSize = n / 2;
        int evenSize = n - oddSize; 

        int[] oddArray = new int[oddSize];
        int[] evenArray = new int[evenSize];
        
		int oddIndex = 0, evenIndex = 0;
		
		for (int j=0; j<n; j++) {
			if(j%2!=0) {
				oddArray[oddIndex++] = inputArray[j];
			}else {
				evenArray[evenIndex++] = inputArray[j];
			}
		}
		Arrays.sort(oddArray);
		Arrays.sort(evenArray);
		
		int[] outputArray = new int[n];
		oddIndex=0;
		evenIndex=evenArray.length-1;
		for (int k=0; k<n; k++) {
			if(k%2!=0) {
				outputArray[k] = oddArray[oddIndex++];
			}else {
				outputArray[k] = evenArray[evenIndex--];
			}
		}
		System.out.println(Arrays.toString(outputArray));
		scan.close();
	}

}
