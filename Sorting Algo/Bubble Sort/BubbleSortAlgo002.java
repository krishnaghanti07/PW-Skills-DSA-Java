// package Sorting Algo.Bubble Sort;
import java.util.*;

public class BubbleSortAlgo002 {
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static boolean isSorted (int[] arr) {
        int n = arr.length ;
        for (int i=1 ; i<n ; i++) {
            if (arr[i-1] <= arr[i]) {
                // do nothing
            } else {
                return false ;
            }
        }
        return true ;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length ;
        for (int i=0 ; i<n ; i++) {
            for (int j=0 ; j<n-i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    swap (arr , j , j+1) ;
                }
            }
            if (isSorted(arr)) {
                break ;
            }
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

        bubbleSort(arr) ;

        System.out.println("Printing the array after sorting : ");
        printArr(arr) ;
        System.out.println();
    }
}
