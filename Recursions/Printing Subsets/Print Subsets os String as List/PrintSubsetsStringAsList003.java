// package Recursions.Printing Subsets.Print Subsets os String as List;
import java.util.*;

public class PrintSubsetsStringAsList003 {
    static List<String> ansArr = new ArrayList<>();
    public static void printSubsets(String str , String ans) {
        // int n = str.length();
        if (str.equals("")) {
            // System.out.println(ans);
            ansArr.add(ans);
            return ;
        }
        String newStr = str.substring(1);
        printSubsets(newStr, ans);  // not include the current character
        char curr = str.charAt(0);
        // ans += str.charAt(0);
        printSubsets(newStr, ans + curr);  // include the current character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ansArr = new ArrayList<>();

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        printSubsets(str , "");
        System.out.println(ansArr);
    }
}
