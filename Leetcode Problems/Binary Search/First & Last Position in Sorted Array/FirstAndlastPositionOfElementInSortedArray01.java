// package Leetcode Problems.Binary Search.First & Last Position in Sorted Array;

public class FirstAndlastPositionOfElementInSortedArray01 {
    class Solution {
        public int[] searchRange(int[] arr, int target) {
           int n = arr.length ;
           int low = 0 , high = n-1 ;
           int first = -1 ;
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                if (arr[mid] == target) {
                    first = mid ;
                    high = mid-1 ;
                } else if (arr[mid] > target) {
                    high = mid-1 ;
                } else {
                    low = mid+1 ;
                }
            }
            if (first == -1) return new int[] {-1 , -1} ;
    
            low = 0 ; high = n-1 ;
            int last = -1 ;
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                if (arr[mid] == target) {
                    last = mid ;
                    low = mid+1 ;
                } else if (arr[mid] > target) {
                    high = mid-1 ;
                } else {
                    low = mid+1 ;
                }
            }
    
            return new int[] {first , last} ;
        }
    }
}
