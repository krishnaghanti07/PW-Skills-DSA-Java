// package Recursions.Basics.Print Number Ascending;
import java.util.*;

public class PrintNumbersAscending002 {
    public static void printNums(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return ;
        }
        printNums(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println("The Numbers are : ");
        printNums(n) ;
    }
}
