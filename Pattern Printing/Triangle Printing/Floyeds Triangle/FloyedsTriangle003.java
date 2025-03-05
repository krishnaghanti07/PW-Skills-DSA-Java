// package Pattern Printing.Triangle Printing.Floyeds Triangle;
import java.util.*;

public class FloyedsTriangle003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Length of The Triangle : ");
        int n = sc.nextInt();

        int a = 1 ;
        for (int i=1 ; i<=n ; i++) {
            for(int j=1 ; j<=i ; j++) {
                System.out.print(a + " ");
                a++ ;
            }
            System.out.println();
        }
    }
}


