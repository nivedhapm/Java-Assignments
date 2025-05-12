package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
//		numbers.add(22);
//		numbers.add(7);
//		numbers.add(98);
//		numbers.add(85);
//		numbers.add(4);
//		numbers.add(11);
//		numbers.add(18);
//		numbers.add(24);
//		numbers.add(20);
		
		Random rand = new Random();
		
		for(int i = 0; i<10; i++) {
			numbers.add(rand.nextInt(100)+1);// nextInt(100) generates 0–99, so +1 gives 1–100
		}
		
		System.out.println("Before sorting: "+numbers);
		
		Collections.sort(numbers);
		
		System.out.println("After sorting: "+numbers);

	}

}
