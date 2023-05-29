package Lists;

import java.util.ArrayList;

/* Week 4 - Day 4
 * Completed on 2023/05/18
 */

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		alist.add(0, 101);
		alist.add(102);
		alist.add(103);
		alist.add(104);
		alist.add(105);
		alist.add(101);
		alist.add(102);
		alist.add(103);
		alist.add(104);
		alist.add(115);
		System.out.println("ArrayList1-->" + alist);
		
		//Testing functions on ArrayList 1
		System.out.println("empty or not : "+alist.isEmpty());
		System.out.println("first index of 102 : "+alist.indexOf(102));
		System.out.println("last index of 102 : "+alist.lastIndexOf(102));	
		System.out.println("size of ArrayList1 : "+alist.size());
		System.out.println("==================");
		
		//Testing functions on ArrayList 2
		ArrayList alist2 = new ArrayList();
		alist2.addAll(alist);
		System.out.println("using addAll");
		System.out.println("ArrayList2 : "+alist2);
		System.out.println("==================");
		System.out.println("Removing everything in first ArrayList");
		alist.removeAll(alist);
		System.out.println(alist);
	}

}
