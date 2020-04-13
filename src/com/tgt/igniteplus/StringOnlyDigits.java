//A program to check if the string contains only digits
package com.tgt.igniteplus;
import java.util.*;
public class StringOnlyDigits {
    public static void main(String[] args){
        System.out.print("Enter the string:");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        if(str.matches("[0-9]+"))
            System.out.println("String contains only digits!");
        else
             System.out.println("String contains characters as well");
    }
}
/*OUTPUT:
1:Enter the string:1234
String contains only digits!
2:Enter the string:my123
String contains characters as well
 */