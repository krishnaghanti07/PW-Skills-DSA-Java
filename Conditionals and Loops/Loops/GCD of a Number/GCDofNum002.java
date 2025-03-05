// package Conditionals and Loops.Loops.GCD of a Number;
import java.util.* ;

public class GCDofNum002 {

    public static int calcGCD(int a , int b) {
        if (b == 0) return a ;
        return calcGCD(b , a%b) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        int gcd = calcGCD(a , b);

        System.out.println("The GCD of "+ a +" and "+ b +" is : "+ gcd);
    }
}
