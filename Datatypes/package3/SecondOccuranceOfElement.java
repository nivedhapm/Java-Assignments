package package3;

public class SecondOccuranceOfElement {

	public static void main(String[] args) {
		int[] inputArray = {1,3,5,2,6,2,1,2};
		int target = 2, counter = 0;
		
		for (int i = 0; i<inputArray.length ; i++) {
			if(inputArray[i]==target) {
				counter++;
			}
			if(counter==2) {
				System.out.printf("The second occurance of %d is at %d",target,i);
				break;
			}
		}

	}

}
