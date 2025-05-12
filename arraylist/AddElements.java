package arraylist;
import java.util.ArrayList;

public class AddElements {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		System.out.println("The third fruit in the ArrayList: "+fruits.get(2));

	}

}
