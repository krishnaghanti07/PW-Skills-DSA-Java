// package Recursions.Printing Sting Recursively;
import java.util.*;

public class PrintingStringRecursively002 {
    public static void printStrRecur(String str) {
        int n = str.length();
        if (n == 0) return ;
        System.out.print(str.charAt(0));
        printStrRecur(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        printStrRecur(str);
    }
}
