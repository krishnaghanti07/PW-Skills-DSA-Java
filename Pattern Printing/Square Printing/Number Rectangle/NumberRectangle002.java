// package Pattern Printing.Number Rectangle;
import java.util.*;

public class NumberRectangle002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The height of the square : ");
        int m = sc.nextInt();
        System.out.print("Enter The width of the square : ");
        int n = sc.nextInt();


        for (int i=0 ; i<m ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print(" "+(j+1)+" ");
            }
            System.out.println();
        }
    }
}
