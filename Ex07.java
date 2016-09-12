/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Write a program to count no of letters, digits, spaces, special characters in a string. */


import java.util.*;

class Ex07   {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        char[] str = sc.nextLine().trim().toCharArray();
        
        int noOfLetters = 0,noOfSpaces = 0, noOfDigits = 0, noOfSpecial = 0;

        for(int i = 0; i < str.length; i++) {
            if(Character.isDigit(str[i]))              noOfDigits++;
            else if(Character.isLetter(str[i]))        noOfLetters++;
            else if(Character.isWhitespace(str[i]))    noOfSpaces++;
            else                                        noOfSpecial++;
        }

        System.out.println("No. of Letters " + noOfLetters);
        System.out.println("No. of Digits " + noOfDigits);
        System.out.println("No. of Spaces " + noOfSpaces);
        System.out.println("No. of Special Characters " + noOfSpecial);
    }
}


/* Output --
edwin@edwin-hp:~/coding/JavaPrograms$ jc Ex07.java
Enter the String:
Edwin &#ar
No. of Letters 7
No. of Digits 0
No. of Spaces 1
No. of Special Characters 2

*/
