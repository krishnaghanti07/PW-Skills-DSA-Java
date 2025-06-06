// package Leetcode Problems.Array Problems.Sort Colors;
import java.util.*;

public class DuchFlagAlgo003 {
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static void sortArr(int[] arr) {
        int n = arr.length ;
        int low=0 , mid=0 , high=n-1 ;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++ ;
                low++ ;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high-- ;
            } else { // if mid == 1
                mid++ ;
            }
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

        System.out.print("Enter The length of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;

        System.out.println("Enter the Elements of the Array : ");
        for (int i=0 ; i<n ; i++) {
            System.out.print("Enter the "+(i+1)+"-th element : ");
            arr[i] = sc.nextInt();
        }

        sortArr(arr) ;

        System.out.print("The Sorted Array is : ");
        printArr(arr);
    }
}

