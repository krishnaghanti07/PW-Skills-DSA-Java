// package Pattern Printing.Triangle Printing.Flip Triangle Star;
import java.util.*;

public class FlipTriangleStar002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Length of The Triangle : ");
        int n = sc.nextInt();

        for (int i=0 ; i<n ; i++) {
            for(int j=i ; j<n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
