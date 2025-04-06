// package Sorting Algo.Merge Sort Algo.Basic Merge Sort;
import java.util.*;

public class BasicMergeSort001 {
    public static void printArr(int[] arr) {
        int n = arr.length ;
        for (int i=0 ; i<n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int[] a, int[] b, int[] arr) {
        int i=0, j=0, k=0 ;
        while (i<a.length && j<b.length) {
            if (a[i] <= b[j]) {
                arr[k++] = a[i++] ;
            } else {
                arr[k++] = b[j++] ;
            }
        }
        while (i < a.length) arr[k++] = a[i++] ;
        while (j < b.length) arr[k++] = b[j++] ;
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length ;
        if (n <= 1) return ; // Base Case

        int mid = n/2 ;

        // Define Two Array
        int[] a = new int[mid];
        int[] b = new int[n - mid];
        // Insert corresponding values to the arrays
        for (int i=0 ; i<mid ; i++) {
            a[i] = arr[i] ;
        }
        for (int i=mid ; i<n ; i++) {
            b[i-mid] = arr[i] ;
        }

        // Apply Recursion-(Mergesort) to ensure the both arrays are sorted
        mergeSort(a);
        mergeSort(b);
        // Apply Merge-Two-Sorted-Array Logic
        merge(a, b, arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i=0 ;i<n ; i++) {
            System.out.print("Enter the "+(i+1)+"-th element : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Printing the array before sorting : ");
        printArr(arr) ;
        System.out.println();

        mergeSort(arr) ;

        System.out.println("Printing the array after sorting : ");
        printArr(arr) ;
        System.out.println();

        sc.close();
    }
}
