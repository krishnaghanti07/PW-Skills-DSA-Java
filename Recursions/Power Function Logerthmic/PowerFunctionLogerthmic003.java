// package Recursions.Power Function Logerthmic;
import java.util.*;

public class PowerFunctionLogerthmic003 {
    public static int power(int a , int b) {
        if (a==0 && b==0) {
            System.out.println("Undefined..!!");
            return -1 ;
        }
        if (b == 0) return 1 ;
        
        // int mid = b/2 ;
        int half = power(a, b/2);

        if (b%2 == 0) {
            return  half * half ;
        } else {
            return a * half * half ;
        }
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
