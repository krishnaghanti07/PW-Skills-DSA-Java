// package 2D Array.Transpose of a Matrix;
import java.util.Scanner;

public class Correcttranspose002 {

    // Function to make the transpose of a matrix
    public static int[][] makeTranspose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[][] transpose = new int[n][m]; // Create a new matrix with swapped dimensions

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = arr[i][j]; // Swap row and column positions
            }
        }
        return transpose;
    }

    // Function to print the matrix
    public static void printArr(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the element at (" + i + ", " + j + "): ");
                arr1[i][j] = sc.nextInt();
            }
        }

        // Create and print the transpose
        int[][] transpose = makeTranspose(arr1);
        System.out.println("Printing the Transposed Matrix: ");
        printArr(transpose);

        sc.close(); // Closing the scanner
    }
}
