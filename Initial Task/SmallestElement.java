
public class SmallestElement {

	public static void main(String[] args) {
		int[] array = {5,2,7,9,20};
		int min = array[0];
		
		for (int i=1; i<array.length; i++) {
			min = Math.min(min, array[i]);
		}
		System.out.println("The smallest element in the array is " +min);
	}

}
