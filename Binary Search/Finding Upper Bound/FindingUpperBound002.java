// package Binary Search.Finding Upper Bound;
import java.util.*;

public class FindingUpperBound002 {
    public static int findUpperBound(int[] arr , int target) {
        int n = arr.length ;
        int low = 0 , high = n-1 ;
        if (target < arr[0]) return  0 ;
        if (target > arr[n-1]) return n ;
        int ans = n ;

        while (low <= high) {
            int mid = low + (high-low)/2 ;
            if (arr[mid] > target) {
                ans = mid ;
                high = mid-1 ;
            } else {
                low = mid+1 ;
            }
        }
        return ans ;
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

        System.out.print("Enter The Element You want to Find it's Upper-Bound in the Array : ");
        int p = sc.nextInt();
        System.out.println();

        int idx = findUpperBound(arr , p) ;

        System.out.println("The Upper Bound of Element "+p+" is the "+(idx)+"-th index of the Array...");
    }
}
