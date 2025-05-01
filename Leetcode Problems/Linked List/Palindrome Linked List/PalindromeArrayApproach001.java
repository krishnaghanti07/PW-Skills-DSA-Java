package Leetcode Problems.Linked List.Palindrome Linked List;

public class PalindromeArrayApproach001 {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ArrayList<Integer> arr = new ArrayList<>() ;
    
            ListNode temp = head ;
            while (temp != null) {
                arr.add(temp.val) ;
                temp = temp.next ;
            }
            int n = arr.size() ;
            int i = 0 , j = n-1 ; 
    
            while (i < j) {
                if (arr.get(i) != arr.get(j)) return false ;
                i++ ;
                j-- ;
            }
            return true ;
        }
    }
}
