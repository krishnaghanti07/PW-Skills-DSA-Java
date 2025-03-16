// package Sorting Algo.Insertion Sort;
import java.util.*;

public class InsertionSortAlgo002 {
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length ;
        for (int i=1 ; i<n ; i++) {
            int temp = arr[i] ;
            int j = i-1 ;
            while (j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j] ;
                j-- ;
            }
            arr[j+1] = temp ;
        }
    }

    public static void printArr(int[] arr) {
        int n = arr.length ;
        for (int i=0 ; i<n ; i++) {
            System.out.print(arr[i] + " ");
        }
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

        insertionSort(arr) ;

        System.out.println("Printing the array after sorting : ");
        printArr(arr) ;
        System.out.println();
    }
}
