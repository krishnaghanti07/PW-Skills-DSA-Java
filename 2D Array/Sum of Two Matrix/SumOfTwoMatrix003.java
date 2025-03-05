// package 2D Array.Sum of Two Matrix;
import java.util.*;

public class SumOfTwoMatrix003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Row of the Two Matrix : ");
        int m = sc.nextInt();
        System.out.print("Enter The Column of the Two Matrix : ");
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n] ;
        int[][] arr2 = new int[m][n] ;
        int[][] arr3 = new int[m][n] ;
        System.out.println("Enter the Elements of the first Matrix : ");
        for (int i=0 ; i<m ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print("Enter the element at ("+i+" , "+j+") : ");
                arr1[i][j] = sc.nextInt() ;
            }
        }
        System.out.println("Enter the Elements of the second Matrix : ");
        for (int i=0 ; i<m ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print("Enter the element at ("+i+" , "+j+") : ");
                arr2[i][j] = sc.nextInt() ;
            }
        }

        for (int i=0 ; i<m ; i++) {
            for (int j=0 ; j<n ; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j] ;
            }
        }

        System.out.println("The Sum of the Two Matrix is : ");
        for (int i=0 ; i<m ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
