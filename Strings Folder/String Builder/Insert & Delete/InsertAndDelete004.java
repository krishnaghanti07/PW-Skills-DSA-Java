// package Strings Folder.String Builder.Insert & Delete;
import java.util.*;

public class InsertAndDelete004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a string : ");
        // String str = sc.nextLine();
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb); // abcdef

        // DeleteCharAt
        sb.deleteCharAt(3);
        System.out.println(sb); // abcef
        System.out.println(sb.charAt(3)); // e

        sb.append("xyz");
        System.out.println(sb); // abcefxyz

        sb.delete(2, 6); // deletes all the characters from index 2 to 5
        System.out.println(sb); // abyz

        // insert 
        sb.insert(2 , "cfx");
        System.out.println(sb); // abcfxyz
    }
}
