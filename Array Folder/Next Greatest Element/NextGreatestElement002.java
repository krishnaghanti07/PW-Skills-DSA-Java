// package Array Folder.Next Greatest Element;
import java.util.*;

public class NextGreatestElement002 {
    public static void nextGreatestElem(int[] arr1 , int[] arr2) {
        int n = arr1.length ;
        arr2[n-1] = -1 ;
        int max = arr1[n-1] ;

        for (int i=n-2 ; i>=0 ; i--) {
            arr2[i] = max ;
            max = Math.max(arr1[i] , max) ;
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
        int[] arr1 = new int[n] ;

        System.out.println("Enter the Elements of the Array : ");
        for (int i=0 ; i<n ; i++) {
            System.out.print("Enter the "+(i+1)+"-th element : ");
            arr1[i] = sc.nextInt();
        }
        
        int[] arr2 = new int[n] ;
        nextGreatestElem(arr1 , arr2) ;

        System.out.print("The Next-Greater-Element Array is : ");
        printArr(arr2);
    }
}

