package Lists;

import java.util.ArrayList;

/* Week 4 - Day 4
 * Completed on 2023/05/18
 */

//1.  No size specified upon creating
//		-Dynamic size
//2.  Insertion order
//3.  Duplicates allowed
public class ArrayListIntro {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // Dynamic Array
		al.add("Siddu");
		al.add(100);
		al.add(3.4);
		al.add('c');
		al.add('c'); //duplicates allowed
		System.out.println(al);// it follows insertion order
		
		al.add(0, "Singapore");
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add("James");
		al2.add(100);
		System.out.println(al2);
		
		al.addAll(al2);
		System.out.println(al);
		
		ArrayList al3 = new ArrayList();
		al3.add("Sabrina");
		al3.add(89.100);
		System.out.println(al3);
		
		al.addAll(1, al3);
		System.out.println(al);

	}

}
