package package5;
import java.util.Arrays;
import java.util.Scanner;

public class RotatesElementsOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number to rotate the array right by that many positions: ");
		int shift = scan.nextInt();
		
		System.out.print("Enter the size of the array: ");
		int n = scan.nextInt();
		
		System.out.println("Enter the elements of the array: ");
		int[] array = new int[n];
		for (int i = 0; i<n; i++) {
			array[i] = scan.nextInt();
		}
		
		int[] rotatedArray = new int[n];
		int k = 0;
		if (shift > n) shift %= n;
		
		for (int i = (n-shift); i<n; i++) {
			rotatedArray[k++] = array[i];
		}
		
		for (int j = 0; j<(n-shift) ; j++ ) {
			rotatedArray[k++] = array[j];
		}
		System.out.println("Original Array: "+ Arrays.toString(array));
		System.out.println("After rotating the elements of the array to the right by " +shift+" positions: "+ Arrays.toString(rotatedArray));
		scan.close();
	}

}
