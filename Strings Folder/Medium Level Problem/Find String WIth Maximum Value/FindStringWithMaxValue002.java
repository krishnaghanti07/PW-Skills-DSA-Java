// package Strings Folder.Find String WIth Maximum Value;
import java.util.*;

public class FindStringWithMaxValue002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"0000000563" , "746745" , "56354" , "0025"} ;
        String maxS = arr[0] ;
        for (int i=0 ; i<arr.length ; i++) {
            maxS = max(maxS , arr[i]);
        }
        System.out.println(maxS);
    }

    public static String max(String a , String b) {
        String s = purify(a) , t = purify(b);
        if (s.length() > t.length()) return a ;
        if (s.length() < t.length()) return b ;
        for (int i=0 ; i<s.length() ; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.charAt(i) > t.charAt(i)) return a ;
                else return b ;
            }
        }
        if (a.length() >= b.length()) return a ;
        else return b ;
    }

    public static String purify(String s) {
        for (int i=0 ; i<s.length() ; i++) {
            if (s.charAt(i) != '0') return s.substring(i);
        }
        return s ;
    }
}
