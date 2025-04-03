// package Recursions.Genarate Parentheses;
import java.util.*;

public class GenerateParentheses002 {
    public static void genParentheses(int op, int cls, int n, String ans) {
        if (ans.length() == (2*n)) {
            System.out.println(ans);
            return ;
        }
        if (ans.isEmpty() || op<n) {
            genParentheses(op+1, cls, n, ans+'(');
        }
        if (cls<n && cls<op) {
            genParentheses(op, cls+1, n, ans+')');
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        genParentheses(0, 0, n, "");
    }
}
