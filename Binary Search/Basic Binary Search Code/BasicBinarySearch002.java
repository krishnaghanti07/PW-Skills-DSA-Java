// package Binary Search.Basic Binary Search Code;
import java.util.*;

public class BasicBinarySearch002 {
    public static int binarySearch(int[] arr , int target) {
        int n = arr.length ;
        int low = 0 , high = n-1 ;

        while (low <= high) {
            int mid = low + (high-low)/2 ;
            if (arr[mid] == target) {
                return mid ;
            } else if (arr[mid] < target) {
                low = mid+1 ;
            } else {
                high = mid-1 ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The length of the Sorted Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;

        System.out.println("Enter the Elements of the Sorted Array : ");
        for (int i=0 ; i<n ; i++) {
            System.out.print("Enter the "+(i+1)+"-th element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter The Element You want to Search in the Array : ");
        int p = sc.nextInt();
        System.out.println();

        int idx = binarySearch(arr , p) ;

        if (idx == -1) {
            System.out.println("No , The Element "+p+" is not presnet in the Array...");
        } else {
            System.out.println("Yes , The Element "+p+" is presnet at the "+(idx)+"-th index of the Array...");
        }
    }
}
