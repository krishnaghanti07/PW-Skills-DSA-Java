// package Recursions.Remove the Occurrance of A;

import java.util.*;

public class RemoveTheOccurranceOfA002 {
    public static void removeOccur(String str) {
        // int n = str.length();
        // if (n == 0) return ;
        if (str.equals("")) return ;
        if (str.charAt(0) != 'a')
            System.out.print(str.charAt(0));
        removeOccur(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        removeOccur(str);
    }
}
