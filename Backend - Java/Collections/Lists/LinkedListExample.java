package Lists;

import java.util.LinkedList;

/* Week 4 - Day 4
 * Completed on 2023/05/18
 */

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.add(0, 101);
		llist.add(102);
		llist.add(103);
		llist.add(104);
		llist.add(105);
		llist.add(106);
		llist.add(107);
		llist.add(108);
		llist.add(109);
		llist.add(110);
		System.out.println("LinkedList1-->" + llist);

		//Testing functions on LinkedList 1
		System.out.println("empty or not : "+llist.isEmpty());
		System.out.println("peekFirst : "+llist.peekFirst());
		System.out.println("peekLast : "+llist.peekLast());	
		System.out.println("==================");
		System.out.println("index of element 105 : "+llist.indexOf(105));
		System.out.println("size of LinkedList1 : "+llist.size());
		System.out.println("==================");
		System.out.println("pop : "+llist.pop());
		System.out.println("size of LinkedList1 : "+llist.size());
		System.out.println(llist);
		System.out.println("==================");
		
		//Testing functions on LinkedList 2
		LinkedList llist2 = new LinkedList();
		llist2.addAll(llist);
		System.out.println("using addAll");
		System.out.println("LinkedList2 : "+llist2);

	}

}
