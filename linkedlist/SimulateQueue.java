package linkedlist;
import java.util.LinkedList;

public class SimulateQueue {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();
		queue.offer("Alice");
		queue.offer("Bob");
		queue.offer("Charlie");
		queue.offer("Diana");
		System.out.println("Before deletion: "+queue); //[Alice, Bob, Charlie, Diana]
		queue.poll();//Removes Alice
		System.out.println("After deletion of first element in queue: "+queue);
		//[Bob, Charlie, Diana]
		queue.poll(); //Removes Bob
		System.out.println("After deletion of first element in queue: "+queue);
		//[Charlie, Diana]
	}

}
