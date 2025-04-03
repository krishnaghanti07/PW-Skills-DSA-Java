// package Recursions.Print Subsets of a String;
import java.util.*;

public class PrintSubsetsOfString002 {
    public static void printSubsets(String str , String ans) {
        // int n = str.length();
        if (str.equals("")) {
            System.out.println(ans);
            return ;
        }
        char curr = str.charAt(0);
        String newStr = str.substring(1);
        printSubsets(newStr, ans + curr);  // include the current character
        printSubsets(newStr, ans);  // not include the current character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        printSubsets(str , "");
    }
}
