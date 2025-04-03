// package Leetcode Problems.Recursions.Climbing Stairs;

public class ClimbingStairs002 {
    class Solution {
        public int climbStairs(int n) {
            if (n <= 2) return n;  // Base cases
    
            int first = 1;  // Represents ways to climb 1 step
            int second = 2;  // Represents ways to climb 2 steps
    
            for (int i = 3; i <= n; i++) {
                int current = first + second;  // Current step is sum of previous two steps
                first = second;  // Move first to second
                second = current;  // Move second to current step
            }
    
            return second;  // The final result is stored in second
        }
    }
    
    
    // class Solution {
    //     public int climbStairs(int n) {
    //         if (n<=2) return n ;
    //         return climbStairs(n-1) + climbStairs(n-2) ;
    //     }
    // }
}
