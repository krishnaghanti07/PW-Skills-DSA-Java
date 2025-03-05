// package Pattern Printing.Triangle Printing.Number Triangle;
import java.util.*;

public class NumberTriangle002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Length of The Triangle : ");
        int n = sc.nextInt();

        for (int i=0 ; i<n ; i++) {
            for(int j=0 ; j<(i+1) ; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
