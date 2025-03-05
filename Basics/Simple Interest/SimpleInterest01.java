// package Basics.Simple Interest;

import java.util.*;

public class SimpleInterest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter your price : ");
        int p = sc.nextInt();
        System.out.print("Enter interest rate : ");
        double r = sc.nextDouble();
        System.out.print("Enter total time in year : ");
        double t = sc.nextDouble();

        double total = (p*r*t)/100 ;

        System.out.printf("The Simple Interest will be : %.2f" , total);
    }
}
