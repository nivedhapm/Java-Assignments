package test;
import java.util.Scanner;
import java.util.Arrays;

public class MaxSumSubarrayOfSizeK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the sub-array size: ");
		int k = sc.nextInt();
		
		subArray(arr, k);
		sc.close();
	}
	
	public static void subArray(int[] arr, int k) {
		int sum = 0, max =0;
		int index = 0;
		
		for(int i = 0; i<=arr.length-k; i++) {
			for(int j = i; j<i+k; j++) {
				sum+=arr[j];
			}
			if(sum>max) {
				max = sum;
				index = i;
			}
			sum = 0;
		}
		int[] sub = new int[k];
		for(int i = 0; i<k; i++) {
			sub[i] = arr[index++];
		}
		System.out.println("Sum: " + max);
		System.out.println("Elements: "+ Arrays.toString(sub));
	}

}
