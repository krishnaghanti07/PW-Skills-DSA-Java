
import java.util.*;

public class FindKClosestElement002 {
    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int n = arr.length ;
            int low = 0 , high = n-k ;
            List<Integer> ans = new ArrayList<>();
    
            while (low < high) {
                int mid = low + (high-low)/2 ;
                if (x-arr[mid] <= arr[mid+k]-x) {
                    high = mid ;
                } else {
                    low = mid+1 ;
                }
            }
    
            for (int i=low ; i<low+k ; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
    }
}
