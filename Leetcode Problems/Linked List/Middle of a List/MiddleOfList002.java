// package Leetcode Problems.Linked List.Middle of a List;

public class MiddleOfList002 {
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fast = head ;
            ListNode slow = head ;
    
            while (fast!=null && fast.next!=null) {
                fast = fast.next.next ;
                slow = slow.next ;
            }
            return slow ;
        }
    }
}
