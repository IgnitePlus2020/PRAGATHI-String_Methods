//A program to illustrate that strings are immutable
package com.tgt.igniteplus;
public class StringImmutable {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "JAVA";
        s1.concat("J2EE");
        System.out.println("String after concatenation : " + s1 );//S1 isnt changed even after concatenation shows that strings are immutable
        if(s1=="JAVA J2EE")
            System.out.print("Strings are mutable");
        else
            System.out.print("Strings are immutable");
    }
}
/*OUTPUT
String after concatenation : JAVA
Strings are immutable
 */