package linkedlist;
import java.util.LinkedList;

public class LinkedListOperations {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 1; i<=10; i++) {
			list.add(i);
		}
		System.out.println("LinkedList before removing elements: "+list);
		list.remove(2);
		list.removeLast();
		System.out.println("LinkedList After removing 3rd and last element: "+list);
	}

}
