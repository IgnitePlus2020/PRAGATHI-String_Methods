//program to remove hyphen(-) from a given string only if it is inbetween digits
package com.tgt.igniteplus;
import java.util.*;
public class RemoveHyphen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        char[] t = str.toCharArray();
        for(int i =0;i<t.length;i++) {
            if (t[i] == '-') {
                int temp = t[i - 1];
                int temp1 = t[i + 1];
                if (temp1 < 65 && temp < 65) {
                    t[i] = t[i + 1];
                    i++;
                }
            }
        }
        System.out.println("String after removing hyphen between digits : "+str);
    }
}
/*OUTPUT:
Enter a string:
134-10/5566 A-block,Manyata Tech-Park
String after removing hyphen between digits : 134-10/5566 A-block,Manyata Tech-Park
 */