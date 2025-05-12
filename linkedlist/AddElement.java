package linkedlist;
import java.util.LinkedList;

public class AddElement {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		
		System.out.println("First element: "+numbers.getFirst());
		System.out.println("Last element: "+numbers.getLast());

	}

}
