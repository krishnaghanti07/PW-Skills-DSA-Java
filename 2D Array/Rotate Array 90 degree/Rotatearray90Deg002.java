// package 2D Array.Rotate Array 90 degree;
import java.util.*;

public class Rotatearray90Deg002 {
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static void revArr(int[] arr) {
        int n = arr.length ;
        if (n==0 || n==1) return ;

        int i=0 , j=n-1 ;
        while (i<j) {
            swap(arr , i , j) ;
            i++ ;
            j-- ;
        }
    }

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

    public static void rotateMatrix(int[][] arr) {
        makeTarnspose(arr);
        for (int i=0 ; i<arr.length ; i++) {
            revArr(arr[i]);
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

        rotateMatrix(arr1) ;

        System.out.println("Printing the Rotated Matrix : ");
        printArr(arr1) ;
    }
}
