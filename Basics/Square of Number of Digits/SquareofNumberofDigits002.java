// package Basics.Square of Number of Digits;
import java.util.*;

public class SquareofNumberofDigits002 {
    public static int countAndSquare(int num) {
        int count = 0 ;
        while (num != 0) {
            count++ ;
            num /= 10 ;
        }
        return (count*count);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int sq = countAndSquare(n) ;
        System.out.println("The Square of the Count of the Number is : "+ sq);
    }
}
