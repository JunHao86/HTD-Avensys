package Strings;

/* Week 2 - Day 4
 * Completed on 2023/05/04
 */

public class StringBuilderExample {

	//Mutable String using StringBuilder
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java Coffee Beans");
		
		System.out.println("Equals--------------------");
		System.out.println(sb.equals(sb));
		System.out.println("\nCompareTo-----------------");
		System.out.println(sb.compareTo(sb));
		System.out.println("\nCharAt(5)-----------------");
		System.out.println(sb.charAt(5));
		System.out.println("\nSubstring(5)--------------");
		System.out.println(sb.substring(5));
		System.out.println("\nSubstring(5,11)-----------");
		System.out.println(sb.subSequence(5, 11));
		System.out.println("\nAppend--------------------");
		System.out.println(sb.append(""));
		System.out.println("\nInsert--------------------");
		System.out.println(sb.insert(17," Good"));
		System.out.println("\nReverse-------------------");
		System.out.println(sb.reverse());
		System.out.println("\nLength--------------------");
		System.out.println(sb.length());
		System.out.println("\nCapacity------------------");
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(50);

		System.out.println("\nCapacity (new)------------");
		System.out.println(sb.capacity());
	}

}
