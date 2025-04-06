// package Sorting Algo.Quick Sort.Find K-th Smallest Element;
import java.util.*;

public class FindKthSmallestElement002 {
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

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[l] ;
        int i=l , j=h ;

        while (i <= j) {
            while (i<=h && arr[i]<=pivot) i++ ;
            while (arr[j] > pivot) j-- ;
            if (i < j) swap(arr, i, j) ;
        }
        swap(arr, l, j);
        return j ;
    }  

    public static int quickSelect(int[] arr, int l, int h, int k) {
        int n = arr.length ;
        if (k<1 || k>n) {
            System.out.println("Invalid value of k");
            return -1;
        }
        
        
        if (l <= h) {
            int pivot = partition(arr, l, h);
            if (pivot == (k-1)) return arr[pivot] ;
            else if (pivot > (k-1)) return quickSelect(arr, l, pivot-1, k); 
            else return quickSelect(arr, pivot+1, h, k);
        }
        return -1 ;
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
        System.out.println();

        System.out.print("Enter K : ");
        int k = sc.nextInt();
        
        System.out.println("Printing the array before Searching : ");
        printArr(arr) ;
        System.out.println();

        int ans = quickSelect(arr, 0, n-1, k) ;

        System.out.println("The "+ k +"-th Smallest Element of the array is : "+ ans);

        sc.close();
    }
}
