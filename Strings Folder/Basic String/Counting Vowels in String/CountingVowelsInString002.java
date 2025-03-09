// package Strings Folder.Basic String.Counting Vowels in String;
import java.util.*;

public class CountingVowelsInString002 {
    public static boolean isVowel(char ch) {
        if (ch=='a' || ch=='A') return true ;
        else if (ch=='e' || ch=='E') return true ;
        else if (ch=='i' || ch=='I') return true ;
        else if (ch=='o' || ch=='O') return true ;
        else if (ch=='u' || ch=='U') return true ;
        else return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        int count = 0 ;
        for (int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                count++ ;
            }
        }
        System.out.println("There are "+ count +" vowels in the String : "+ str);
    }
}
