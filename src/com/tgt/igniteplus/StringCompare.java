//program to demonstrate ways to compare 2 strings
package com.tgt.igniteplus;
import java.util.*;
public class StringCompare {
    public static void main(String[] args){
        String s1,s2;
        System.out.println("Enter the 2 strings");
        Scanner in=new Scanner(System.in);
        s1=in.nextLine();
        s2=in.nextLine();
        System.out.println(s1 +" equals "+ s2 +"->"+s1.equals(s2));
        System.out.println(s1 +" equalsIgnoreCase "+ s2 +"->"+s1.equalsIgnoreCase(s2));
        int result = s1.compareTo(s2);
        if(result == 0)
            System.out.println(s1+" is equal to "+s2);
        else
            System.out.println(s1+" is not equal to "+s2);
        result = s1.compareToIgnoreCase(s2);
        if(result == 0)
            System.out.println(s1+" is equal to "+s2);
        else
            System.out.println(s1+" is not equal to "+s2);
    }
}
/*OUTPUT:
1.Enter the 2 strings
Hello
HELLO
Hello equals HELLO->false
Hello equalsIgnoreCase HELLO->true
Hello is not equal to HELLO
Hello is equal to HELLO

2.Enter the 2 strings
Target
India
Target equals India->false
Target equalsIgnoreCase India->false
Target is not equal to India
Target is not equal to India
 */