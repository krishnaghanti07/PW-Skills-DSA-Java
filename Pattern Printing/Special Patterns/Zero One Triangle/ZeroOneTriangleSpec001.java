import java.util.*;

public class ZeroOneTriangleSpec001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the length of the Triangle : ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++) {
            int a = (i%2==0) ? 0 : 1 ;
            for (int j=1 ; j<=i ; j++) {
                System.out.print(a + " ");
                a = (a==1) ? 0 : 1 ; 
            }
            System.out.println();
        }
    }
}
