// package Strings Folder.String Builder.Basic StringBuilder;
import java.util.*;

public class BasicStringBuilder003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String str = new String("PW Skills");
        StringBuilder sb = new StringBuilder("PW Skills..");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        String st = new String("krishna");
        StringBuilder s = new StringBuilder(st);
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());

        StringBuilder pp = new StringBuilder(10);
        System.out.println(pp);
        System.out.println(pp.length());
        System.out.println(pp.capacity());

        StringBuilder p = new StringBuilder();
        System.out.println(p);
        System.out.println(p.length());
        System.out.println(p.capacity());
    }
}
