// package Recursions.Basics.Print Numbers Descending;
import java.util.*;

public class PrintNumbersInDescending002 {
    public static void printNums(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return ;
        }
        System.out.print(n + " ");
        printNums(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println("The Numbers are : ");
        printNums(n) ;
    }
}
