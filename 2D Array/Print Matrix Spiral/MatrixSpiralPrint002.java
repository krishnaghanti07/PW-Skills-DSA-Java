// package 2D Array.Print Matrix Spiral;
import java.util.*;

public class MatrixSpiralPrint002 {
    public static void printArr(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void sprialMatrix(int[][] arr , List<Integer> ans) {
        int m = arr.length ;
        int n = arr[0].length ;

        int tr=0 , br=m-1 , lc=0 , rc=n-1 ;

        while (tr<=br && lc<=rc) {
            for (int i=lc ; i<=rc ; i++) {
                ans.add(arr[tr][i]) ;
            }
            tr++ ;
            for (int i=tr ; i<=br ; i++) {
                ans.add(arr[i][rc]);
            }
            rc-- ;
            if (tr <= br) {
                for (int i=rc ; i>=lc ; i--) {
                    ans.add(arr[br][i]);
                }
                br-- ;
            }
            if (lc <= rc) {
                for (int i=br ; i>=tr ; i--) {
                    ans.add(arr[i][lc]) ;
                }
                lc++ ;
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
        List<Integer> ans = new ArrayList<>(m*n) ;
        System.out.println("Enter the Elements of the Matrix : ");
        for (int i=0 ; i<m ; i++) {
            for (int j=0 ; j<n ; j++) {
                System.out.print("Enter the element at ("+i+" , "+j+") : ");
                arr1[i][j] = sc.nextInt() ;
            }
        }

        sprialMatrix(arr1 , ans) ;

        System.out.println("Printing The Matrix in Spiral-Form : ");
        printArr(ans) ;
    }
}

