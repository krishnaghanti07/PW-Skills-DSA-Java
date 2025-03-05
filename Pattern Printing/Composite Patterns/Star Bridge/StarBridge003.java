// package Pattern Printing.Composite Patterns.Star Bridge;
import java.util.*;

public class StarBridge003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the height of the Bridge : ");
        int n = sc.nextInt();

        for (int j=1 ; j<=(2*n)-1; j++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print("*" + " ");
            }
            for (int j=1 ; j<=(2*i)-1; j++) {
                System.out.print(" " + " ");
            }
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}


