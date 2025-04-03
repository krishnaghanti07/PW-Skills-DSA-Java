// package Recursions.GCD of a Two Numbers;

import java.util.*;

public class GCDofTwoNumbers002 {
    public static int calcGCD(int a, int b) {
        if (b == 0) return a ;
        return calcGCD(b, a%b) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        int ans = calcGCD(a, b);
        System.out.println("The GCD of "+ a +" and "+ b +" is : "+ ans);
    }
}
