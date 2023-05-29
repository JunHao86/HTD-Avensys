package Lists;

import java.util.LinkedList;

/* Week 4 - Day 4
 * Completed on 2023/05/18
 */

//1.  Node each contains prevReference, data, nextReference
//2.  Insertion order
//3.  Duplicates allowed
//4.  Continuous memory allocation not required
public class LinkedListIntro {

	public static void main(String[] args) {
		 
		LinkedList ll = new LinkedList();// doubly linked list
		ll.add(100);
		ll.add('A');
		ll.add("Siddu");
		ll.add(34.7);
		ll.add(34.7); // duplicates are allowed
		ll.add(100000);
		System.out.println(ll); // insertion order preserved
		
		ll.add(0, "Sabrina");
		System.out.println(ll);
		
		LinkedList ll2 = new LinkedList();
		ll2.add("Emmanuel");
		ll2.add(350);
		 
		ll.addAll(ll2);
		System.out.println(ll);
		 
		ll.addAll(0, ll2);
		System.out.println(ll);
		 
		ll.addFirst("Silas");
		System.out.println(ll);
		 
		ll.addLast("Rish");
		System.out.println(ll);	
	}
}
