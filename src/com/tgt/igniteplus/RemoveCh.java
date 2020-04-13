/*To remove all the occurences of a paricular character in the given string */
package com.tgt.igniteplus;
import java.util.*;
public class RemoveCh {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=in.nextLine();
        System.out.println("Enter the character to be removed in the above string:");
        char ch=in.next().charAt(0);
        char other_case;
        if(Character.isLowerCase(ch))
            other_case=Character.toUpperCase(ch);
        else
            other_case=Character.toLowerCase(ch);
        char[] array=str.toCharArray();
        int i,j=0;
        for(i=0;i<str.length();i++) {
            if (array[i] == ch || array[i] == other_case);
            else
                array[j++] = array[i];
        }
        while(j<i) {
            array[j++] = '\0';
        }
        System.out.print("Modified String : ");
        System.out.println(array);
    }
}
/*OUTPUT:
Enter a string:
To test the string
Enter the character to be removed in the above string:
t
Modified String : o es he sring
 */