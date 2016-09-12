/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Cosine Series*/


import java.util.*;

class Ex1C	{
	public static void main(String [] args)	{
		System.out.print("Enter the Values of 'x' anf 'n': ");

		Scanner sc = new Scanner( System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
	
		CosSeries test = new CosSeries(x,n);
		test.display();

	}
}

class CosSeries	{
	double x;
	int n;

	CosSeries ()	{
		x = 0;
		n = 0;
	}

	CosSeries (double x, int n)	{
		this.x = Math.toRadians(x);
		this.n = n;
	}

	void display()	{
		double sum=1, term=0, denom=1, numer=1;
		int sign = 1;

		for(int i = 1; i <= this.n; i++)	{
			term = 1;
			numer *= x;
			denom *= i;

			if(i%2 == 0)	{
				sign *= -1;
				term = sign * (numer / denom);
				sum += term;
			}

		}

		System.out.println("The Cos is " + sum);
	}
}



/* Output --
Enter the Values of 'x' anf 'n': 45 54
The Cos is 0.7071067811865475
*/
