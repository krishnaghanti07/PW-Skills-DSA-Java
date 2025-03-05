// package Array Folder.Linear Search;
import java.util.*;

public class LinearSearchArray002 {
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

        System.out.print("Enter The Element You want to Search in the Array : ");
        int p = sc.nextInt();
        System.out.println();

        int count = 0 ;
        for (int i=0 ; i<n ; i++) {
            if (p == arr[i]) {
                System.out.println("Yes , The Element "+p+" is presnet at the "+(i)+"-th index of the Array...");
                break ;
            } else {
                count++ ;
            }
        }
        if (count == n) {
            System.out.println("No , The Element "+p+" is not presnet in the Array...");
        }
    }
}
