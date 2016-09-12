/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Write a Program to prints equivalent Binary Number of a given Decimal using Recursion.*/


import java.util.*;
class Ex04    {
    public static void main(String[] args)  {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = sc.nextInt();

        toBinary(num);
    }

    static void toBinary(int num)   {
        if(num == 0) {
            System.out.print("0");
            return;
        }else{
            toBinary(num/2);
            System.out.print(num%2);
        }
    }
}


/* Output --
edwin@edwin-hp:~/coding/JavaPrograms$ jc Ex04.java
Enter the number:128
010000000
*/
