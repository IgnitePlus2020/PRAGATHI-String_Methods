//program to find the length of the input string
package com.tgt.igniteplus;
import java.util.*;
public class StringLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        int n=str.length();
        System.out.println("Length of the given string  is "+n);
    }
}
/*OUTPUT:
Enter a string:
Target India
Length of the given string  is 12
 */
