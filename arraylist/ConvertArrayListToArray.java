package arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple","banana","cherry"));
		
		//converting ArrayList to Array
		String[] fruitsArray = new String[fruits.size()];
		fruitsArray = fruits.toArray(fruitsArray);
		System.out.println("Converted ArrayList to Array: "+ Arrays.toString(fruitsArray));

		//converting Array to ArrayList
		ArrayList<String> list = new ArrayList<>(Arrays.asList(fruitsArray));
		System.out.println("Converted Array to ArrayList: "+list);
	}

}
