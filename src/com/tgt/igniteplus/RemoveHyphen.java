//program to remove hyphen(-) from a given string only if it is inbetween digits
package com.tgt.igniteplus;
import java.util.Scanner;
public class RemoveHyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        char[] string = str.toCharArray();
        char[] newStringArray = new char[str.length()];
        int i, j = 0;
        for (i = 0; i < str.length(); i++) {
            if ((string[i] == '-') && (Character.isDigit(string[i - 1])) && (Character.isDigit(string[i + 1])));
            else {
                newStringArray[j] = string[i];
                j++;
            }
        }
        System.out.print("String after removing hyphen : ");
        System.out.print(newStringArray);
    }
}
/*OUTPUT:
Enter the string : 
134-10/5566 A-block,Manyata Tech-Park
String after removing hyphen : 13410/5566 A-block,Manyata Tech-Park 
 */
