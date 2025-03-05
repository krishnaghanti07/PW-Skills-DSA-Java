// package Pattern Printing.Composite Patterns.Number Bridge;
import java.util.*;

public class NumBridge003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the height of the Bridge : ");
        int n = sc.nextInt();

        for (int j=1 ; j<=(2*n)-1; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i=1 ; i<=n ; i++) {
            int num = 1 ;
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print(num + " ");
                num++ ;
            }
            for (int j=1 ; j<=(2*i)-1; j++) {
                System.out.print(" " + " ");
                num++ ;
            }
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print(num + " ");
                num++ ;
            }
            System.out.println();
        }
    }
}


