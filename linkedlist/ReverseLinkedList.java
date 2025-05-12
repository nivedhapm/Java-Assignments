package linkedlist;

import java.util.LinkedList;
import java.util.Collections;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Character> letters = new LinkedList<>();
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        letters.add('E');
        
        System.out.println("Original LinkedList: " + letters);

        reverseList(letters);

        System.out.println("Reversed LinkedList: " + letters);
    }

    // Method to reverse the LinkedList
    public static void reverseList(LinkedList<Character> list) {
LinkedList<Character> reversedList = new LinkedList<>(); 
        
        while (!list.isEmpty()) {
            // Remove from the front and add to the front of the reversed list
            reversedList.addFirst(list.removeFirst());
        }

        list.addAll(reversedList);
    }
}

