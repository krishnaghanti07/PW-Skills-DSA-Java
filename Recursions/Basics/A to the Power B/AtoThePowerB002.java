// package Recursions.Basics.A to the Power B;
import java.util.*;

public class AtoThePowerB002 {
    public static int power(int a , int b) {
        if (a==0 && b==0) {
            System.out.println("Undefined..!!");
            return -1 ;
        }
        if (b == 0) return 1 ;
        return a * power(a , b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the power Number : ");
        int b = sc.nextInt();

        int ans = power(a , b) ;

        System.out.println("The Number "+ a +" to the power "+ b +" is : "+ ans);
    }
}
