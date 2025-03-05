// package Leetcode Problems.Array Problems.Sort Array Of 0 and 1;
import java.util.*;

public class SortArraysOf0and1 {
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static void sortArr(int[] arr) {
        int n = arr.length ;
        int i=0 , j=n-1 ;

        while (i<j) {
            if (arr[i]==0) i++ ;
            else if (arr[j]==1) j-- ;
            else if (arr[i]==1 && arr[j]==0) {
                swap(arr , i , j) ;
                i++ ;
                j-- ;
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

