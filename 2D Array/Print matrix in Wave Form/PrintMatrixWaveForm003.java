// package 2D Array.Print matrix in Wave Form;
import java.util.*;

public class PrintMatrixWaveForm003 {
    public static void printArrType1(int[] arr) {
        for (int i=0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }

    public static void printArrType2(int[] arr) {
        for (int i=arr.length-1 ; i>=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }

    public static void printWaveForm(int[][] arr) {
        int n = arr.length ;

        for (int i=0 ; i<n ; i++) {
            if (i%2 == 0) {
                printArrType1(arr[i]);
            } else {
                printArrType2(arr[i]);
            }
        }
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

        System.out.println("Printing The Matrix in Wave-Form : ");
        printWaveForm(arr1) ;
    }
}

