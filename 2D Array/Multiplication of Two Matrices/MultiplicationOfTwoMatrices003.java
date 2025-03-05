// package 2D Array.Multiplication of Two Matrices;
import java.util.*;

public class MultiplicationOfTwoMatrices003 {
    public static void matrixMultiplication(int[][] a , int[][] b , int[][] c) {
        for (int i=0 ; i<a.length ; i++) {
            for (int j=0 ; j<b[0].length ; j++) {
                int sum = 0 ;
                for (int k=0 ; k<a[0].length ; k++) {
                    sum += (a[i][k] * b[k][j]) ;
                }
                c[i][j] = sum ;
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int i=0 ; i<arr.length ; i++) {
            for (int j=0 ; j<arr[0].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows of the first matrix : ");
        int r1 = sc.nextInt();
        System.out.print("Enter the no. of columns of the first matrix : ");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1] ;
        System.out.println("Now Enter The Elements of the First Matrix : ");
        for (int i=0 ; i<r1 ; i++) {
            for (int j=0 ; j<c1 ; j++) {
                System.out.print("Enter the element at ("+i+" , "+j+") : ");
                a[i][j] = sc.nextInt() ;
            }
        }
        System.out.println();

        System.out.print("Enter the no. of rows of the second matrix : ");
        int r2 = sc.nextInt();
        System.out.print("Enter the no. of columns of the second matrix : ");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2] ;
        System.out.println("Now Enter The Elements of the Second Matrix : ");
        for (int i=0 ; i<r2 ; i++) {
            for (int j=0 ; j<c2 ; j++) {
                System.out.print("Enter the element at ("+i+" , "+j+") : ");
                b[i][j] = sc.nextInt() ;
            }
        }
        System.out.println();

        if (c1 != r2) {
            System.out.println("Matrix Multiplication can't be possible..!");
            return ;
        }
        int[][] c = new int[r1][c2] ;
        matrixMultiplication(a , b , c) ;
        System.out.println("The new generated matrix after multiplication is : ");
        printMatrix(c) ;
    }
}
