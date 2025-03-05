// package Array Folder.Two Pointers.Merge Two Sorted Array;
import java.util.*;

public class MergeTwoSortedArray003 {
    public static void mergeSortedArr(int[] arr1 , int[] arr2 , int[] arr3) {
        int n1=arr1.length , n2=arr2.length , n3=arr3.length ;
        int i=0 , j=0 , k=0 ;

        while (i<n1 && j<n2) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i] ;
                i++ ; k++ ;
            } else {
                arr3[k] = arr2[j];
                j++ ; k++ ;
            }
        }
        while (i < n1) {
            arr3[k] = arr1[i] ;
            i++ ; k++ ;
        }
        while (j < n2) {
            arr3[k] = arr2[j] ;
            j++ ; k++ ;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 3, 5, 7, 9} ;
        int[] arr2 = {2, 4, 6, 8, 10} ;

        int n1=arr1.length , n2=arr2.length ;
        int n3 = n1+n2 ;
        int[] arr3 = new int[n3] ;

        mergeSortedArr(arr1 , arr2 , arr3) ;

        System.out.print("The Merged Array is : ");
        printArr(arr3) ;
    }
}
