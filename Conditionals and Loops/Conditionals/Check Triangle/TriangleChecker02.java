// package Conditionals and Loops.Conditionals.Check Triangle;
import java.util.*;

public class TriangleChecker02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter 1st Side : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Side : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Side : ");
        int c = sc.nextInt();

        if (a==b && b==c && c==a) {
            System.out.println("This is an Equilateral Triangle...");
        } else if ((a==b) || (b==c) || (c==a)) {
            System.out.println("This is an Isosceles Triangle...");
        } else {
            System.out.println("This is an Scalene Triangle...");
        }
    }
}

