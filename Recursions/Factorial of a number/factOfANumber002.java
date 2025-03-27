// package Recursions.Factorial of a number;
import java.util.*;

public class factOfANumber002 {
    public static int fact(int n) {
        if (n == 1) return 1 ;
        return n * fact(n-1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int ans = fact(n) ;
        System.out.println("The Factorial of the Numebr "+ (n) +" is : "+ ans);
    }
}
