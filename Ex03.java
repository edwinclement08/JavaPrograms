/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Add two Complex Numbers */


import java.util.*;

class Complex   {
    double x, y;

    Complex(double x, double y)   {
        this.x = x;
        this.y = y;
    }
    
    Complex()   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y for Complex number(x+iy):");
        x = sc.nextDouble();
        y = sc.nextDouble();
    }

    Complex add(Complex other)  {
        double u = this.x + other.x;
        double v= this.y + other.y;
        Complex result = new Complex(u, v);
        return result;
    }

    void display()  {
        System.out.println("[" + x + ((y > 0)?("+" + y):("" + y)) + "i]");
    }
}

public class Ex3   {
    public static void main(String args[])  {
        System.out.println("Enter the Value of First Complex Number");
        Complex c1 = new Complex();
        System.out.println("Enter the Value of Second Complex Number");
        Complex c2 = new Complex();

        Complex c3 = c1.add(c2);
        c3.display();
    }
}

/* Output --
Enter the Value of First Complex Number
Enter x and y for Complex number(x+iy):
2 3
Enter the Value of Second Complex Number
Enter x and y for Complex number(x+iy):
12 54
[14.0+57.0i]
*/
