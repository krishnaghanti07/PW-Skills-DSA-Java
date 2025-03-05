// package Array Problems.Two Sum;
import java.util.*;

public class TwoSumArray002 {
    public static List<List<Integer>> findPair(int[] arr , int p) {
        int n = arr.length ;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i=0 ; i<n ; i++) {
            for (int j=i+1 ; j<n ; j++) { // Avoid pairing with itself
                if (arr[i]+arr[j] == p) {
                    ans.add(Arrays.asList(arr[i] , arr[j]));
                }
            }
        }
        return ans ;
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

        System.out.print("Enter The target : ");
        int p = sc.nextInt();

        List<List<Integer>> ans = findPair(arr , p);

        System.out.println("The pairs, that's sum is meets the target are : " + ans);
    }
}


