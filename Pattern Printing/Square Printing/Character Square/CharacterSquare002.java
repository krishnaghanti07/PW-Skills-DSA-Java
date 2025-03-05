// package Pattern Printing.Character Rectangle;
import java.util.*;

public class CharacterSquare002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The length of the square : ");
        int n = sc.nextInt();


        for (int i=0 ; i<n ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print(" "+(char)(j+65)+" ");
            }
            System.out.println();
        }
    }
}

