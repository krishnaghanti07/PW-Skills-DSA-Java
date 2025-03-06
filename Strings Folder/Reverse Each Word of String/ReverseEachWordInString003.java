// package Strings Folder.Reverse Each Word of String;
import java.util.*;

public class ReverseEachWordInString003 {
    public static void reverse(StringBuilder sb , int i , int j) {
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        int i=0 , j=0 ;
        while (j < n) {
            if (sb.charAt(j) != ' ') j++ ;
            else {
                reverse(sb , i , j-1) ;
                i = j+1 ;
                j = i ;
            }
        }
        reverse(sb, i, j-1);

        return sb.toString() ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = sc.nextLine() ;
        String str = reverseWords(s) ;
        System.out.println("After reverse : "+ str);
    }
}
