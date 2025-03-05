// package 2D Array.Transpose of a Matrix;
import java.util.*;

public class transposeOfaMatrix003 {
    public static void makeTarnspose(int[][] arr) {
        int m = arr.length ;
        int n = arr[0].length ;

        for (int i=0 ; i<m ; i++) {
            for (int j=i ; j<n ; j++) {
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i] ;
                arr[j][i] = temp ;
            }
        }
    }

    public static void printArr(int[][] arr) {
        int m = arr.length ;
        int n = arr[0].length ;

        for (int i=0 ; i<m ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Row of the Two Matrix : ");
        int m = sc.nextInt();
        System.out.print("Enter The Column of the Two Matrix : ");
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n] ;
        System.out.println("Enter the Elements of the Matrix : ");
        for (int i=0 ; i<m ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print("Enter the element at ("+i+" , "+j+") : ");
                arr1[i][j] = sc.nextInt() ;
            }
        }

        makeTarnspose(arr1) ;

        System.out.println("Printing the Transpose Matrix : ");
        printArr(arr1) ;
    }
}
