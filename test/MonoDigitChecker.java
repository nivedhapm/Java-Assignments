package test;
import java.util.Scanner;


public class MonoDigitChecker {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number to check mono-digit: ");
		 int input = sc.nextInt();
		 
		 String s = Integer.toString(input);
		 int[] arr = new int[s.length()];
		 for(int i = 0; i<s.length(); i++) {
			 arr[i] = s.charAt(i) - '0';
		 }
//		 System.out.println(Arrays.toString(arr));
		 
		 if(arr.length==1) {
			 System.out.println(arr[0]);
		 }
		 if(arr.length==2) {
			 System.out.println(arr[0]+arr[1]);
		 }
		 int n1 = arr[0];
		 int n2 = arr[0] - arr[1];
		 int n3 = arr[0] + arr[1];
		 
		 if(isMono(arr, n1, 1)) {
			 System.err.println(n1 + " is the mono-digit number of "+input);
		 }
		 else if(isMono(arr, n2, 2)) {
			 System.err.println(n2 + " is the mono-digit number of "+input);
		 }
		 else if(isMono(arr, n3, 2)) {
			 System.err.println(n3 + " is the mono-digit number of "+input);
		 }
		 else {
			 System.out.println(input + " can't be made to a mono-digit number.");
		 }
		 sc.close();
	}
	
	public static boolean isMono(int[] arr, int target, int index) {
		boolean mono = true;
		for(int i = index; i<arr.length;) {
			if(arr[i] == target) {
				mono = true;
				i++;
			}
			else if(i+1<arr.length && (arr[i]+arr[i+1] == target 
					|| arr[i]-arr[i+1]==target)) {
				mono = true;
				i+=2;
			}
			else {
				return false;
			}
		}
		return mono;
	}

}
