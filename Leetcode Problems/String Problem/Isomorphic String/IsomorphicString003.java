// package Leetcode Problems.String Problem.Isomorphic String;
import java.util.*;

public class IsomorphicString003 {
    public static boolean checkIsIsomorphic(String s , String t) {
        if (s.length() != t.length()) return false ;
        char[] arr = new char[128];

        for (int i=0 ; i<s.length() ; i++) {
            char ch = s.charAt(i) ;
            char dh = t.charAt(i) ;
            int idx = (int) (ch) ;
            if (arr[idx] == '\0') { // '\0' --> null
                arr[idx] = dh ;
            } else {
                if (arr[idx] != dh) return false ;
            }
        }
        for (int i=0 ; i<128 ; i++) {
            arr[i] = '\0' ;
        }
        for (int i=0 ; i<t.length() ; i++) {
            char ch = t.charAt(i) ;
            char dh = s.charAt(i) ;
            int idx = (int) (ch) ;
            if (arr[idx] == '\0') { // '\0' --> null
                arr[idx] = dh ;
            } else {
                if (arr[idx] != dh) return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String : ");
        String s = sc.next();
        System.out.print("Enter Second String : ");
        String t = sc.next();

        boolean isIsomorphic = checkIsIsomorphic (s , t);

        if (isIsomorphic) {
            System.out.println("Yes.., Both the Strings are isomorphic");
        } else {
            System.out.println("No.., Both the Strings are not isomorphic");
        }
    }
}
