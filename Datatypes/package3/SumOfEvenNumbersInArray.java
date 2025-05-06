package package3;

import java.util.Arrays;

public class SumOfEvenNumbersInArray {

	public static void main(String[] args) {
		int[] inputArray = {1,4,2,5,6,7,9,8,12,10};
		int sum = 0;
		for (int i = 0; i<inputArray.length; i++) {
			if(inputArray[i]%2==0) {
				sum+=inputArray[i];
			}
			else {
				continue;
			}
		}
		System.out.println("The sum of the even numbers in the array "
		+ Arrays.toString(inputArray) + " = " + sum);
	}

}
