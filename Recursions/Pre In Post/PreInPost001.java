// package Recursions.Pre In Post;
import java.util.*;

public class PreInPost001 {
    public static void printZigZag(int n) {
        if (n==0) return ;
        System.out.println(n + " --> Pre ");
        printZigZag(n-1);
        System.out.println(n + " --> In ");
        printZigZag(n-1);
        System.out.println(n + " --> Post ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        printZigZag(n);
    }
    
}
