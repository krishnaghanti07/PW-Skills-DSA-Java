// package Strings Folder.String Builder.Toggle Characters of a String;
import java.util.*;

public class ToggleCharsOfString003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        for (int i=0 ; i<sb.length() ; i++) {
            char ch = sb.charAt(i) ;
            int ascii = (int)ch;

            if (ascii>=65 && ascii<=90) {
                ascii += 32 ;
            }

            else if (ascii>=97 && ascii<=122) {
                ascii -= 32 ;
            }

            ch = (char)ascii ;
            sb.setCharAt(i, ch);
        }

        System.out.println("After Toggle : "+ sb);
    }
}
