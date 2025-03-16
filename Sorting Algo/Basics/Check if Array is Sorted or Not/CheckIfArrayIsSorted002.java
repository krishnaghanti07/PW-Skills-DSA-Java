// package Sorting Algo.Basics.Check if Array is Sorted or Not;
import java.util.*;

public class CheckIfArrayIsSorted002 {
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

        for (int i=1 ; i<n ; i++) {
            if (arr[i-1] <= arr[i]) {
                // do nothing
            } else {
                System.out.println("No.. The Array is not sorted..");
                return ;
            }
        }
        System.out.println("Yes.. The Array is sorted..");
    }
}
