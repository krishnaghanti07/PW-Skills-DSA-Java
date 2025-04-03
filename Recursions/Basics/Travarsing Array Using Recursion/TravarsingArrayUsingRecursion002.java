
// package Array Folder.Second Largest Element;
import java.util.*;

public class TravarsingArrayUsingRecursion002 {
    public static void printArrayRecur(int[] arr, int idx) {
        int n = arr.length ;

        if (idx==n) return ;
        System.out.print(arr[idx] + " ");
        printArrayRecur(arr , idx+1);
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

        System.out.println("Printing Array Recursively : ");
        printArrayRecur(arr , 0);
    }
}
