// package Leetcode Problems.Binary Search.Peak Index In Mountain Array;

public class PeakIndexInMountain002 {
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length ;
            int start = 1 , end = n-2 ;
    
            while (start <= end) {
                int mid = start + (end-start)/2 ;
                if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                    return mid ;
                } else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
                    start = mid+1 ;
                } else if (arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) {
                    end = mid-1 ;
                }
            }
            return -1 ;
        }
    
        // public int peakIndexInMountainArray(int[] arr) {
        //     int n = arr.length ;
        //     int start = 0 ;
        //     int end = n-1 ;
    
        //     while (start < end) {
        //         int mid = start + (end-start)/2 ;
        //         if (arr[mid] > arr[mid+1]) {
        //             end = mid ;
        //         } else {
        //             start = mid+1 ;
        //         }
        //     }
        //     return start ;
        // }
    }
}
