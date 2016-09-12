/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Display the Number Pattern*/


import java.util.*;

class Ex1A 	{
	public static void main(String args[])	{
		System.out.print("Please Enter the number of lines:");


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		Pattern test = new Pattern(n);
		test.drawTriangle();
	}
}

class Pattern	{
	int number;

	Pattern()	{
		number = 3;
	}

	Pattern(int n)	{
		this.number = n;
	}


	void drawTriangle()	{
		for(int i = 1; i <= this.number; i++)	{
			// for spaces
			for(int j = this.number - i; j > 0; j--)	System.out.print(" ");

			// for numbers
			for(int j = 0; j < i; j++) System.out.print(i + " ");
			
			// for newline
			System.out.println();
		}
	}
}


/* Output --
Please Enter the number of lines:9

        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 
*/
