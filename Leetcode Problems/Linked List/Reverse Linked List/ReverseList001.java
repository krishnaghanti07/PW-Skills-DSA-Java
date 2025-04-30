package Leetcode Problems.Linked List.Reverse Linked List;

public class ReverseList001 {
    class Solution {
        public ListNode reverseList(ListNode head) {
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
    }
}
