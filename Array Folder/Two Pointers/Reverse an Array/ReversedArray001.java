// package Array Folder.Two Pointers.Reverse an Array;
import java.util.*;

public class ReversedArray001 {
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static void revArr(int[] arr) {
        int n = arr.length ;
        if (n==0 || n==1) return ;

        int i=0 , j=n-1 ;
        while (i<j) {
            swap(arr , i , j) ;
            i++ ;
            j-- ;
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
        System.out.println();

        revArr(arr) ;

        System.out.print("The Revresed Array is : ");
        printArr(arr);
    }
}
