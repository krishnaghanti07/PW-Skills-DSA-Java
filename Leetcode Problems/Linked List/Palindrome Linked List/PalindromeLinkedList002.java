package Leetcode Problems.Linked List.Palindrome Linked List;

public class PalindromeLinkedList002 {
    class Solution {
        public ListNode rev(ListNode head) {
            ListNode prev = null ;
            ListNode temp = head ;
            ListNode agla = temp ;
    
            while (temp != null) {
                agla = temp.next ;
                temp.next = prev ;
                prev = temp ;
                temp = agla ;
            }
            return prev ;
        }
    
        public boolean isPalindrome(ListNode head) {
            if (head==null || head.next==null) return true ;
    
            ListNode slow = head ;
            ListNode fast = head ;
    
            while (fast!=null && fast.next!=null) {
                slow = slow.next ;
                fast = fast.next.next ;
            }
            ListNode temp = rev(slow) ;
            ListNode i = head ;
    
            while (temp != null) {
                if (temp.val != i.val) return false ;
                temp = temp.next ;
                i = i.next ;
            }
            return true ;
        }
    }
}
