
import java.util.*;

// package Leetcode Problems.Recursions.Subsets;

public class Subsets002 {
    class Solution {
        static List<List<Integer>> ans = new ArrayList<>();
        public void createSubsets(int[] arr, int idx, List<Integer> part) {
            if (idx == arr.length) {
                ans.add(new ArrayList<>(part));
                return ;
            }
            // Excluding the Current Element
            createSubsets(arr, idx+1, part); // --> pre Recurrsive Call
    
            int curr = arr[idx];  // Inner Working
            part.add(curr) ;
    
            // Including the Current Element
            createSubsets(arr, idx+1, part); // --> post Recurrsive Call
    
            // Backtrack: remove the element that was just added
            part.remove(part.size() - 1);
        }
    
        public List<List<Integer>> subsets(int[] arr) {
            ans = new ArrayList<>();
            List<Integer> part = new ArrayList<>();
            createSubsets(arr, 0, part) ;
            return ans ;
        }
    }
}
