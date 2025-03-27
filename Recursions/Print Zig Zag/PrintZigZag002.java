// package Recursions.Print Zig Zag;
import java.util.*;

public class PrintZigZag002 {
    public static void printZigZag(int n) {
        if (n==0) return ;
        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        printZigZag(n);
    }
    
}
