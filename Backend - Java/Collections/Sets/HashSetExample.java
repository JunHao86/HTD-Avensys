package Sets;
import java.util.HashSet;

/* Week 4 - Day 5
 * Completed on 2023/05/19
 */

public class HashSetExample {

	public static void main(String[] args)  {
		HashSet hs = new HashSet(); // Hashing algorithm
		hs.add(100);
		hs.add(150);
		hs.add(75);
		hs.add(50);
		System.out.println(hs); // insertion order will not be preserved
	}

}
