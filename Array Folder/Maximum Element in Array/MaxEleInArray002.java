// package Array Folder.Maximum Element in Array;
import java.util.*;

public class MaxEleInArray002 {
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

        int max = Integer.MIN_VALUE ;
        for (int i=0 ; i<n ; i++) {
            max = Math.max(arr[i] , max);
        }

        System.out.println("The Maximum Element of the Array is : " + max);
    }
}
