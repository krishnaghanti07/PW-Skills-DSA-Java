// package Leetcode Problems.Linked List.Delete Middle Node of a List;

public class DeleteMiddleNodeOfList002 {
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head==null || head.next == null) return null ;
    
            ListNode fast = head ;
            ListNode slow = head ;
            ListNode prev = null ;
            
            while (fast!=null && fast.next!=null) {
                fast = fast.next.next ;
                prev = slow ; // Keeping track of the node before slow
                slow = slow.next ;
            }
            prev.next = slow.next ; // Deleting the Middle Node
            return head ;
        }
    }
}
