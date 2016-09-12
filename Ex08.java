/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Write a program to accept a string and display each character of the string separately. A
 * character should not be repeated. Along with this, display the number of times the character
 * appears. */

import java.util.*;

public class Ex08    {
    public static void main(String[] args)  {
        System.out.print("Enter the string for which you want to count the frequency of: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(); // for newline

        char[] characters  = new char[input.length()];
        int[] count = new int[input.length()];      // for the possibility that all characters are unique.
        int ptr = 0;                            // for knowing how much of the above arrays is utilized.
        boolean flag = false;                           // for checking previous occurance

        char ch;             // for ease of not using charAt all the time
        int j;
        for(int i = 0; i < input.length(); i++) {       // for iterating through all the characters in the String
            ch = input.charAt(i);                       // for ease
            
            flag = false;
            for(j = 0; j < ptr; j++)    {               // for looking through the character array for previous occurances.
                if(characters[j] == ch) {
                    flag = true;
                    break;
                }
            }

            if(flag)    {       // character is repeated
                // j is the position of the detected character.
                count[j]++;     //increment the counter.
            }   else    {       // First occurance of the char
                characters[ptr] = ch;
                count[ptr] = 1;
                ptr++;          // for keeping track of the position in the char array.
            }
        }

        // For Outputting the Results
        System.out.println("The Frequency Table is as Follows:");
        //  +-----------+-----------+
        //  | Character | Frequency |
        //  |     c     |    no     |
        //  ...
        //  +-----------+------------+
        
        System.out.println("+-----------+-----------+");
        System.out.println("| Character | Frequency |");
        for(int i = 0; i < ptr; i++)    {
            System.out.println(String.format("|    '%c'    |    %-7s|", characters[i], Integer.toString(count[i])));
        }
        System.out.println("+-----------+-----------+");
    }
}

/* Output
edwin@edwin-hp:~/coding/JavaPrograms$ jc Ex08.java
Enter the string for which you want to count the frequency of: Haven of Maven

The Frequency Table is as Follows:
+-----------+-----------+
| Character | Frequency |
|    'H'    |    1      |
|    'a'    |    2      |
|    'v'    |    2      |
|    'e'    |    2      |
|    'n'    |    2      |
|    ' '    |    2      |
|    'o'    |    1      |
|    'f'    |    1      |
|    'M'    |    1      |
+-----------+-----------+

*/
