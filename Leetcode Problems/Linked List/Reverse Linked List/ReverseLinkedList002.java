package Leetcode Problems.Linked List.Reverse Linked List;

public class ReverseLinkedList002 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head==null || head.next==null) return head ;
    
            ListNode reversed = reverseList(head.next) ;
            head.next.next = head ;
            head.next = null ;
            return reversed ;
        }
    }
}
