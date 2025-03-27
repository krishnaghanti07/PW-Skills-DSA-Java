// package Recursions.Basics.N th Fibonacci Number;

import java.util.*;

public class NthFibonacciNumber003 {
    public static int fibo(int n) {
        if (n <= 1) return n ;
        return fibo(n-1) + fibo(n-2) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int ans = fibo(n) ;
        System.out.println("The "+ n +"-th fibonacci Number is : "+ ans);
    }
}