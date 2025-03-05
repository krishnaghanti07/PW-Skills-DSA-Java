// package Conditionals and Loops.Loops.First N of Fibonacci Series;
import java.util.* ;

public class FirstNofFibonacciSerise002 {
    public static int getFibo(int n) {
        if (n==1 || n==2) return 1 ;
        return getFibo(n-1) +  getFibo(n-2) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.print("First "+n+" Fibonacci Numbers are : ");
        for (int i=1 ; i<=n ; i++) {
            int num = getFibo(i) ;
            System.out.print(num + " ");
        }
    }
}
