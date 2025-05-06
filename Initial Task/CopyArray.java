import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scan.nextInt();
		
		System.out.println("Enter the elements(numbers) of the array: ");
		int[] inputArray = new int[n];
		for (int i=0; i<n; i++) {
			inputArray[i]=scan.nextInt();
		}
		
		int[] arrayCopy = new int[n];
		System.arraycopy(inputArray,0, arrayCopy,0, n);
		
		System.out.println("Array Copied successfully!");
		System.out.println("Input Array: "+ Arrays.toString(inputArray));
		System.out.println("Copied Array: "+ Arrays.toString(arrayCopy));
		
		scan.close();
	}

}
