// package Leetcode Problems.Linked List.Delete N-th Node From Last;

public class DeleteNthNodeFromLast002 {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast = head ;
            ListNode slow = head ;
    
            for (int i=1 ; i<=n ; i++) { // first move fast pointer n-times
                fast = fast.next ;
            }
            if (fast == null) return head.next ; // If we've to delete the head
    
            while (fast.next != null) { // move slow & fast pointer together
                fast = fast.next ;
                slow = slow.next ;
            }
            slow.next = slow.next.next ; // deletion logic
            return head ;
        }
    }
}
