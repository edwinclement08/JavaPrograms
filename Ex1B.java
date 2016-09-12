/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Sort Numbers taken from Command Line */


import java.util.*;

class Ex1B 	{
	public static void main(String args[])	{
		if(args.length < 3) {
            System.out.println("The Program is supposed to be used like:");
            System.out.println("    java Ex1B <num1> <num2> <num3>");
            System.out.println("where <num1>, <num2> and <num3> are three integers.");
			System.exit(1);
        }

		int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);

		Sort test = new Sort(a, b, c);
        System.out.println("The given numbers in Sorted oreder(Ascending) is:->");
		test.ascending();

	}
}

class Sort	{
	int a, b, c;

	Sort()	{
		a = b = c = 0;
	}

	Sort(int a, int b,  int c)	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void ascending()	{
		if( a <= b && b <= c) System.out.println(a+" "+b+" "+c);
		if( a <= c && c <= b) System.out.println(a+" "+c+" "+b);

		if( b <= a && a <= c) System.out.println(b+" "+a+" "+c);
		if( b <= c && c <= a) System.out.println(b+" "+c+" "+a);

		if( c <= b && b <= a) System.out.println(c+" "+b+" "+a);
		if( c <= a && a <= b) System.out.println(c+" "+a+" "+b);
	}
}

/* Output --
bash-3.2$ java Ex1B 34 5624 2
2 34 5624
*/
