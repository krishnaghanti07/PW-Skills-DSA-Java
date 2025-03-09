// package Strings Folder.String Builder.Set Character;
import java.util.*;

public class SetCharAt002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        sb.setCharAt(1 , 'a');
        System.out.println(sb);

    }
}
