// package Pattern Printing.Number Square;
import java.util.*;

public class NumberSquare002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The length of the square : ");
        int n = sc.nextInt();


        for (int i=0 ; i<n ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print(" "+(j+1)+" ");
            }
            System.out.println();
        }
    }
}

