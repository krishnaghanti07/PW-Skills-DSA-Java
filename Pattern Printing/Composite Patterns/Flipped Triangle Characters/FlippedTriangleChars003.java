// package Pattern Printing.Composite Patterns.Flipped Triangle Characters;
import java.util.*;

public class FlippedTriangleChars003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the length of the Triangle : ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print(" " + " ");
            }
            for (int j=1 ; j<=i ; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}

