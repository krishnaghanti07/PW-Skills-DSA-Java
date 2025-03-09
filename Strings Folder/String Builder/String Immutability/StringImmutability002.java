// package Strings Folder.String Builder.String Immutability;
import java.util.*;

public class StringImmutability002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        String s = "" ;
        for (int i=0 ; i<str.length() ; i++) {
            if (i%2 == 0) {
                s += 'a' ;
            } else {
                s += str.charAt(i) ;
            }
        }

        System.out.println("The Updated String will be : "+ s);
    }
}
