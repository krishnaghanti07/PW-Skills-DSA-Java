public class MinimizedMaximumOfProductsDistributedToKStore003 {
    class Solution {
        public int findMax(int[] arr) {
            int maxi = Integer.MIN_VALUE ;
            for (int i=0 ; i<arr.length ; i++) {
                maxi = Math.max(arr[i] , maxi);
            }
            return maxi ;
        }
    
        public boolean isPossible(int[] arr, int n, int maxQ) {
            int stores = 0 ;
            for (int i=0 ; i<arr.length ; i++) {
                if (arr[i]%maxQ == 0) stores += (arr[i]/maxQ);
                else stores += (arr[i]/maxQ) + 1 ;
                // stores += Math.ceil((double)arr[i]/maxQ) ;
            }
            return (stores <= n);
        }
    
        public int minimizedMaximum(int n, int[] arr) {
            int m = arr.length ;
            int low = 1 ;
            int high = findMax(arr);
            int ans = high ;
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                if (isPossible(arr, n, mid)) {
                    ans = mid ;
                    high = mid-1 ;
                } else {
                    low = mid+1 ;
                }
            }
            return ans ;
        }
    }
}
