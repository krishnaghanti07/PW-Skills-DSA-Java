// package Conditionals and Loops.Loops.Check isPalindrome;
import java.util.* ;

public class Checkispalindrome003 {
    public static boolean chkpalndrm(String str) {
        int n = str.length();
        int i = 0 , j = n-1 ;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++ ;
                j-- ;
            } else {
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.next();

        boolean check = chkpalndrm(str) ;
        
        if (check) {
            System.out.println("Yes..! "+ str + " is a Palindrome String...");
        } else {
            System.out.println("No..! "+ str + " is not a Palindrome String...");           
        }
    }
}
