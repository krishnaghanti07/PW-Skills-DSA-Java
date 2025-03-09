// package Strings Folder.Basic String.Print All Substring of a String;
import java.util.*;

public class AllSubstringPrint003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        System.out.print("All the Substrings are : ");
        for (int i=0 ; i<str.length() ; i++) {
            for (int j=i+1 ; j<=str.length() ; j++) {
                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
}
