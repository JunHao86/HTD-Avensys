package Sets;
import java.util.LinkedHashSet;

/* Week 4 - Day 5
 * Completed on 2023/05/19
 */

public class LinkedHashSetExample {
	//Linked Hash Set [Best at searching]
	public static void main(String[] args)  {
		LinkedHashSet hs = new LinkedHashSet(); // Hashing algorithm
		hs.add(100);
		hs.add(150);
		hs.add(75);
		hs.add(50);
		System.out.println(hs); // insertion is preserved
	}

}
