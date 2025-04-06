// package Sorting Algo.Quick Sort.Randomized Quick Sort;
import java.util.*;

public class RandomizedQuickSort002 {
    public static void printArr(int[] arr) {
        int n = arr.length ;
        for (int i=0 ; i<n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    // Modified Partition Logic
    public static int partition(int[] arr, int l, int h) {
        // Step 1: Find the middle index and swap it with the first element
        int mid = l + (h - l) / 2;
        swap(arr, l, mid); // Swap middle element with first to use it as pivot
    
        int pivot = arr[l];
        int i = l + 1;
        int j = h;
    
        // Step 2: Normal partitioning logic
        while (i <= j) {
            while (i <= h && arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < j) swap(arr, i, j);
        }
    
        // Step 3: Place pivot in correct position
        swap(arr, l, j);
        return j;
    }
    

    public static void quickSort(int[] arr, int l, int h) {
        int n = arr.length ;
        
        if (l < h) {
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot-1); 
            quickSort(arr, pivot+1, h);
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

        quickSort(arr, 0, n-1) ;

        System.out.println("Printing the array after sorting : ");
        printArr(arr) ;
        System.out.println();

        sc.close();
    }
}
