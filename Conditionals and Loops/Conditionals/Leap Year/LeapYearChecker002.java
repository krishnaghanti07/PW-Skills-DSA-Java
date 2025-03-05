// package Conditionals and Loops.Conditionals;
import java.util.*;

public class LeapYearChecker002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();

        if (year%100!=0 && year%4==0) {
            System.out.println(year + " is a Leap year...");
        } else if (year%100==0 && year%400==0) {
            System.out.println(year + " is a Leap year...");          
        } else {
            System.out.println(year + " is not a Leap year...");
        }
    }
}
