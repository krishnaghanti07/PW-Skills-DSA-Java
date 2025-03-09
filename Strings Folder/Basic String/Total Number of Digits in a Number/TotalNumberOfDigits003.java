// package Strings Folder.Basic String.Total Number of Digits in a Number;
import java.util.*;

public class TotalNumberOfDigits003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        // String str = Integer.toString(num);  // (Built-in-method)
        String str = "" + num ;
        int n = str.length() ;
        
        System.out.println("There are "+n+" digits present in the number..");
    }
}
