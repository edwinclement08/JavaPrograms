/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Equivalen: Binary Number*/


import java.util.*;
class Ex4    {
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
Enter the number:28
011100
*/
