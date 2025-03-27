
// package Recursions.Basics.N th Fibonacci Number;

import java.util.*;

public class NoOfWaysToClimbNStairs {
    public static int stair(int n) {
        if (n <= 2) return n ;
        return stair(n-1) + stair(n-2) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int ans = stair(n) ;
        System.out.println("For "+ n +" stairs there are : "+ ans +" ways..");
    }
}