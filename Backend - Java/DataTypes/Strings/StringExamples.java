package Strings;

/* Week 2 - Day 3
 * Completed on 2023/05/03
 */

public class StringExamples {

	public static void main(String[] args) {
		String s1 = new String("This is not a Python Class");
		System.out.println(s1);
		System.out.println("--------------------------");
		System.out.println(s1.toUpperCase());
		System.out.println("--------------------------");
		System.out.println(s1.toLowerCase());
		System.out.println("--------------------------");
		System.out.println(s1.contains("Class"));
		System.out.println("--------------------------");
		System.out.println(s1.contains("Java"));
		System.out.println("--------------------------");
		System.out.println(s1.indexOf('P'));
		System.out.println("--------------------------");
		System.out.println(s1.charAt(14));
		System.out.println("--------------------------");
		System.out.println(s1.substring(14));
		System.out.println("--------------------------");
		System.out.println(s1.substring(14, 20));
	}
}
