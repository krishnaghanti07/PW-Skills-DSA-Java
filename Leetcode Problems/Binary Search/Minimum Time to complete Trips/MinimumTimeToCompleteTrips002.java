// package Leetcode Problems.Binary Search.Minimum Time to complete Trips;

public class MinimumTimeToCompleteTrips002 {
    class Solution {
        public int findMin(int[] arr) {
            int mini = Integer.MAX_VALUE ;
            for (int i=0 ; i<arr.length ; i++) {
                mini = Math.min(arr[i] , mini);
            }
            return mini ;
        }
    
        public boolean checkTrips(int[] arr , int totalTrips , long time) {
            long tripsCount = 0 ;
            for (int i=0 ; i<arr.length ; i++) {
                tripsCount += (time/arr[i]) ;
            }
            return (tripsCount >= totalTrips) ;
        }
    
        public long minimumTime(int[] arr, int totalTrips) {
            int n = arr.length ;
            long low = 1 ;
            long high = (long)totalTrips * findMin(arr) ;
            long ans = high ;
    
            while (low <= high) {
                long mid = low + (high-low)/2 ;
                if (checkTrips(arr , totalTrips , mid)) {
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
