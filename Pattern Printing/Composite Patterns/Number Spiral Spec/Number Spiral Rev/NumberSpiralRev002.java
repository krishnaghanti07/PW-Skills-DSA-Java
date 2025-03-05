// package Pattern Printing.Composite Patterns.Number Spiral Spec.Number Spiral Rev;
import java.util.*;

public class NumberSpiralRev002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The length-space : ");
        int n = sc.nextInt();


        for (int i=1 ; i<=2*n-1 ; i++) {
            for (int j=1 ; j<=2*n-1 ; j++) {
                int a = (i>n) ? (2*n-i) : i ;
                int b = (j>n) ? (2*n-j) : j ;

                System.out.print(n+1-Math.min(a , b) + " ");
            }
            System.out.println();
        }
    }
}

