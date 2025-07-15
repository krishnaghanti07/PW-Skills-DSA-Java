package Leetcode Problems.Queue Questions.Sliding Window Maximum;

public class SlidingWindowMax002 {
    class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums==null || k<=0) return new int[0] ;

        int n = nums.length ;
        int[] res = new int[n-k+1] ;
        int resi = 0 ;
        Deque<Integer> q = new ArrayDeque<>() ; // Take an ArrayDeque for efficient 'poll()' and 'offer()'

        for (int i=0 ; i<n ; i++) {
            while (!q.isEmpty() && q.peek()<i-k+1) // Remove the out of window elements
                q.poll() ;
            while (!q.isEmpty() && nums[i]>nums[q.peekLast()] ) // Remove the smaller elements from the right hand side
                q.pollLast() ;

            q.offer(i) ; // Offer the Deque the current element

            if (i >= k-1) // Keep updating the resultant array from the first window
                res[resi++] = nums[q.peek()] ;
        }
        return res ; // Return the result
    }
}
}
