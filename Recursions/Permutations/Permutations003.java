package Recursions.Permutations;
import java.util.*;

public class Permutations003 {
    public static void printPermutations(String str , String ans) {
        int n = str.length() ;
        if (n == 0) {
            System.out.println(ans);
            return ;
        }
        for (int i=0 ; i<n ; i++) {
            char curr = str.charAt(i);
            String newStr = (str.substring(0, i)) + (str.substring(i+1));
            printPermutations(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.next();

        System.out.println("Printing The Permutations of the String : ");
        printPermutations(str , "");
    }
}
