//program to remove hyphen(-) from a given string only if it is inbetween digits
package com.tgt.igniteplus;
import java.util.Scanner;
public class RemoveHyphen
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= in.nextLine();
        char[] s = str.toCharArray();
        char[] newStr = new char[str.length()];
        int j=0,i;
        newStr[j++]=s[0];
        for(i=1;i<str.length();i++)
        {
            if(s[i] == '-' && s[i-1]<65 && s[i+1]<65);
            else
                newStr[j++]= s[i];
        }

        System.out.print("The string after hyphen removal is ");
        System.out.println(newStr);
    }

}
/*OUTPUT:
Enter a string
134-10/5566 A-block,Manyata Tech-Park
The string after hyphen removal is 13410/5566 A-block,Manyata Tech-Park 

Enter a string
-134-10/5566 A-block, New Manyata Tech-Park 12-45 testing
The string after hyphen removal is -13410/5566 A-block, New Manyata Tech-Park 1245 testing
 */
