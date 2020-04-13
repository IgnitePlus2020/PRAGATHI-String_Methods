//program to check if the string is empty or not
package com.tgt.igniteplus;
import java.util.*;
public class EmptyString {
    public static void main(String[] args){
        System.out.print("Enter the string:\n");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        if(str.isEmpty())
            System.out.print("The string is empty");
        else
            System.out.print("The string is not empty");
    }
}
/*OUTPUT:
1Enter the string:

The string is empty
2.Enter the string:
abcd
The string is not empty
 */