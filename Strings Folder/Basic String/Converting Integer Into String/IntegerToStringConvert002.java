// package Strings Folder.Basic String.Converting Integer Into String;
import java.util.*;

public class IntegerToStringConvert002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println();

        // String str = num + "." ;
        // str = str.substring(0 , str.length());
        String str = num + "" ;

        System.out.println(str);
    }
}
