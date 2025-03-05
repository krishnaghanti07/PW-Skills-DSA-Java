// package Array Folder.Second Largest Element;
import java.util.*;

public class SecLargElem002 {
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

        int max = arr[0] ;
        int smax = Integer.MIN_VALUE ;
        for (int i=0 ; i<n ; i++) {
            if (arr[i] > max) {
                smax = max ;
                max = arr[i] ;
            }
            else if (arr[i]>smax && arr[i]<max) {
                smax = arr[i] ;
            }
        }

        if (smax == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists (array may have all identical elements).");
        } else {
            System.out.println("The Second-Largest Element of the Array is : " + smax);
        }
    }
}
