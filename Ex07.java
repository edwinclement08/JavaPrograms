/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Count No of Spaces, Digits, Characters, Special*/


import java.util.*;

class Ex7   {
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
Enter the String:
edwfbu 5389 *(%$
No. of Letters 6
No. of Digits 4
No. of Spaces 2
No. of Special Characters 4
*/
