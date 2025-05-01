package Leetcode Problems.Linked List.Maximum Twin Sum of a Linked List;

public class maxTwinSumOfList002 {
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
        public int pairSum(ListNode head) {
            ListNode slow = head ;
            ListNode fast = head ;
    
            while (fast!=null) {
                slow = slow.next ;
                fast = fast.next.next ;
            }
            int sum = head.val ;
            ListNode temp1 = head ;
            ListNode temp2 = rev(slow) ;
    
            while (temp2 != null) {
                sum = Math.max(sum, (temp1.val + temp2.val)) ;
                temp1 = temp1.next ;
                temp2 = temp2.next ;
            }
            return sum ;
        }
    }
}
