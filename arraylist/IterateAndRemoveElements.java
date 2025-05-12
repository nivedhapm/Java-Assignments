package arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateAndRemoveElements {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			int num = itr.next();
			if(num>30) {
				itr.remove();
			}
		}
		System.out.println("Modified List: "+numbers);
	}

}
