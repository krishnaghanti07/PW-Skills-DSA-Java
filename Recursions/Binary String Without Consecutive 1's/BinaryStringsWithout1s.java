// package Recursions.Binary String Without Consecutive 1's;
import java.util.*;

public class BinaryStringsWithout1s {
    public static void printBinStr(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return ;
        }
        printBinStr(n-1, ans+'0');
        if (ans.isEmpty() || (ans.charAt(ans.length()-1)) != '1') {
            printBinStr(n-1, ans+'1');
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println();

        System.out.println("Printing all the binary substring without consecutive 1's : ");
        printBinStr(n , "");
    }
}
