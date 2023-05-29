package Queues;

import java.util.ArrayDeque;

/* Week 4 - Day 5
 * Completed on 2023/05/19
 */

//1.  Used best when adding elements to the front, or end of the Array
//2.  At front/end, adds node to store value
//3.  No shifting operation of elements involved 
//4.  Makes use of Dynamic Array structure
public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();// Dynamic Array
		ad.add(10);
		ad.add(20);
		ad.add(30);
		
		//insertion at front/back end
		ad.addFirst(100); 
		ad.addLast(200);
		
		//index based access not permitted
		System.out.println(ad.getFirst()); 
		System.out.println(ad.getLast());
		System.out.println(ad);
	}

}
