package Primitives;

/* Week 1 - Day 4
 * Completed on 2023/04/27
 */

public class PrimitiveDataExamples {

	//Example of Implicit/Explicit typecasting
	public static void main(String[] args) {
		
		//short, byte
		System.out.println("(Implicit) byte --> short");
		byte a = -63;
		short b;
		b = a;
		System.out.println(b);
		System.out.println("//=============");
		
		System.out.println("(Explicit) short --> byte");
		a = (byte)b;
		System.out.println(a);
		System.out.println("//=============");
		System.out.println();
		
		//==================================================================
		
		//int, long
		System.out.println("(Implicit) int --> long");
		int c = 450;
		long d;
		d = c;
		System.out.println(c);
		System.out.println("//=============");
		
		System.out.println("(Explicit) long --> int");
		c = (int)d;
		System.out.println(d);
		System.out.println("//=============");
		System.out.println();
		
		//==================================================================
		
		//float, double
		System.out.println("(Implicit) float --> double");
		float e = 420.13f;
		double f;
		f = e;
		System.out.println(e);
		System.out.println("//=============");
		
		System.out.println("(Explicit) double --> float");
		e = (float)f;
		System.out.println(f);
		System.out.println("//=============");
		System.out.println();
		
		//==================================================================
		
		//char, int
		System.out.println("(Implicit) char --> int");
		char g = '.';
		int h;
		h = g;
		System.out.println(h);
		System.out.println("//=============");
		
		System.out.println("(Explicit) int --> char");
		g = (char)h;
		System.out.println(g);
		System.out.println("//=============");
		System.out.println();
		
		//==================================================================
		
		//declaring long using l
		System.out.println("//=============");
		System.out.println("long");
		long j = 2147483648l;
		System.out.println(j);
		System.out.println("//=============");
		
		//wrapping
		Byte abyte = Byte.valueOf((byte)1);
		System.out.println("Value of byte = " +abyte);
	}

}
