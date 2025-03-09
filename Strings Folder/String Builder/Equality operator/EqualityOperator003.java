// package Strings Folder.String Builder.Equality operator;
import java.util.*;

public class EqualityOperator003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "abcxyz" ;   // "abcxyz"
        String a = "abcxyz" ;   // "abcxyz"
        String b = new String(s) ;  // "abcxyz"
        String c = "abc" ;  
        c = c + "xyz" ;  // "abcxyz"

        System.out.println(s == a); // true
        System.out.println(s == b); // false 
        System.out.println(s == c); // false

        System.out.println(s.equals(a));    // true
        System.out.println(s.equals(b));    // true
        System.out.println(s.equals(c));    // true
    }
}
