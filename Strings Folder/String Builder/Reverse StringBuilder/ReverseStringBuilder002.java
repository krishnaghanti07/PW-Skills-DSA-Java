// package Strings Folder.String Builder.Reverse StringBuilder;
import java.util.*;

public class ReverseStringBuilder002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int n = sb.length() ;
        for (int i=0 ; i<n/2 ; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(n-i-1));
            sb.setCharAt(n-i-1, temp);
        }

        System.out.println("After Reverse : "+ sb);
    }
}
