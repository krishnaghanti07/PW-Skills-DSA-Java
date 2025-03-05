// package Pattern Printing.Star Square;
import java.util.*;

public class StrrSquarepattern002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The length of the square : ");
        int n = sc.nextInt();


        for (int i=0 ; i<n ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
