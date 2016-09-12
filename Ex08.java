/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim: Display Frequency of Each Character in a String. */

import java.util.*;

public class Ex8    {
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
Enter the string for which you want to count the frequency of: Edwin Clement

The Frequency Table is as Follows:
+-----------+-----------+
| Character | Frequency |
|    'E'    |    1      |
|    'd'    |    1      |
|    'w'    |    1      |
|    'i'    |    1      |
|    'n'    |    2      |
|    ' '    |    1      |
|    'C'    |    1      |
|    'l'    |    1      |
|    'e'    |    2      |
|    'm'    |    1      |
|    't'    |    1      |
+-----------+-----------+

*/
