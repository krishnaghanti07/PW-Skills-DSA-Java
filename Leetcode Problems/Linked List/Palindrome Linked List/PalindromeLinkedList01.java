package Leetcode Problems.Linked List.Palindrome Linked List;

public class PalindromeLinkedList01 {
    class Solution {
        public ListNode reverse(ListNode head) {
            if (head==null || head.next==null) return head ;
    
            ListNode reversed = reverse(head.next) ;
            head.next.next = head ;
            head.next = null ;
            return reversed ;
        }
    
        public boolean isPalindrome(ListNode head) {
            if (head==null || head.next==null) return true ;
    
            ListNode slow = head ;
            ListNode fast = head ;
            ListNode prev = null ;
    
            while (fast!=null && fast.next!=null) {
                prev = slow ;
                slow = slow.next ;
                fast = fast.next.next ;
            }
            // if (fast != null) slow = slow.next ;
            ListNode tail = reverse(slow) ;
            prev.next = null ;
    
            while (tail!=null && head!=null) {
                if (tail.val != head.val) return false ;
                tail = tail.next ;
                head = head.next ;
            }
            return true ;
        }
    }
}
