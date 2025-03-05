// package Pattern Printing.Mixed Number Character;
import java.util.*;

public class NumberCharacterMixedTri003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Length of The Triangle : ");
        int n = sc.nextInt();

        for (int i=0 ; i<n ; i++) {
            if (i%2 == 0) {
                for(int j=0 ; j<(i+1) ; j++) {
                    System.out.print((j+1) + " ");
                }
            } else  {
                for(int j=0 ; j<(i+1) ; j++) {
                    System.out.print((char)(j+65) + " ");
                }
            }
            System.out.println();
        }
    }
}


