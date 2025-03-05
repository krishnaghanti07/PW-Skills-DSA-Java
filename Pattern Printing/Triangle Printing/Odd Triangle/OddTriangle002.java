// package Pattern Printing.Triangle Printing.Odd Triangle;
import java.util.*;

public class OddTriangle002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Length of The Triangle : ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++) {
            for(int j=1 ; j<=i ; j++) {
                System.out.print((j*2)-1 + " ");
            }
            System.out.println();
        }
    }
}


