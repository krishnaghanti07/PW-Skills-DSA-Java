// package Leetcode Problems.Binary Search.Search in Rotated Sorted Array;

public class SearchInRotatedSortedArray02 {
    class Solution {
        public int search(int[] arr, int target) {
            int n = arr.length ;
            int low = 0 , high = n-1 ;
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                if (arr[mid] == target) return mid ;
                else if (arr[mid] < arr[high]) { // we're in right-sorted part
                    if (arr[mid]<=target && target<=arr[high]) { // target present in right
                        low = mid+1 ;
                    } else { // target present in left
                        high = mid-1 ;
                    }
                } else { // we're in left-sorted part
                    if (arr[low]<=target && target<=arr[mid]) { // target present in left
                        high = mid-1 ;
                    } else { // target present in right
                        low = mid+1 ;
                    }
                }
            }
            return -1 ;
        }
    
        // public int search(int[] arr, int target) {
        //     int n = arr.length;
        //     int st = 0 , end = n-1 ;
    
        //     while (st <= end) {
        //         int mid = st + (end-st)/2 ;
    
        //         if (arr[mid] == target) return mid ;
        //         else if (arr[st] <= arr[mid]) { // if Left-Sorted
        //             if (arr[st]<=target && target<=arr[mid]) { // Present in Left
        //                 end = mid-1 ;
        //             } else { // Present in Right
        //                 st = mid+1 ;
        //             }
        //         } else { // if Rightt-Sorted
        //             if (arr[mid]<=target && target<=arr[end]) { // Present in Right
        //                 st = mid+1 ;
        //             } else { // Present in Left
        //                 end = mid-1 ;
        //             }
        //         }
        //     }
        //     return -1 ;
        // }
    }
    
}
