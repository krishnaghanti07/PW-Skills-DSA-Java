// package Leetcode Problems.Binary Search.Sqrt of X;

public class SqrtOfX {
    class Solution {
        public int mySqrt(int x) {
            // return ((int)Math.sqrt(x)) ; // use Newton-Raphson method (fastest)
            int low = 0 , high = x ;
            int ans = 0 ; // Using Binary-Search on Answers
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                long sqr = (long) mid * mid;
                if (sqr <= x) {
                    ans = mid ;
                    low = mid+1 ;
                } else {
                    high = mid-1 ;
                }
            }
            return ans ;
        }
    }
}
