// package Array Folder.Minimum Element in Array;
import java.util.*;

public class MinArrayElem002 {
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

        int min = Integer.MAX_VALUE ;
        for (int i=0 ; i<n ; i++) {
            min = Math.min(arr[i] , min);
        }

        System.out.println("The Minimum Element of the Array is : " + min);
    }
}
