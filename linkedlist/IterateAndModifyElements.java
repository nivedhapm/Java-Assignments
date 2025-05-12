package linkedlist;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateAndModifyElements {

	public static void main(String[] args) {
		LinkedList<String> str = new LinkedList<>(Arrays.asList("one","two","three","four","five"));
		System.out.println("LinkedList elements: "+str);
		ListIterator<String> l = str.listIterator();
		while(l.hasNext()) {
			String s = l.next();
			if(s=="three") {
				l.set("THREE");
			}
		}
		System.out.println("After replacing: "+str);
	}

}
