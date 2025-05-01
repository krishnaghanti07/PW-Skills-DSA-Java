package Leetcode Problems.Linked List.ReOrder List;

public class ReOderedLiist002 {
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
        public void reorderList(ListNode head) {
            if (head==null || head.next==null) return ;
    
            ListNode slow = head ;
            ListNode fast = head ;
    
            while (fast.next!=null && fast.next.next!=null) {
                slow = slow.next ;
                fast = fast.next.next ;
            }
            ListNode temp2 = rev(slow.next) ;
            slow.next = null ;
            ListNode temp1 = head.next ;
    
            int count = 0 ;
            while (temp1!=null && temp2!=null) {
                if (count % 2 == 0) {
                    head.next = temp2 ;
                    temp2 = temp2.next ;
                } else {
                    head.next = temp1 ;
                    temp1 = temp1.next ;
                }
                head = head.next ;
                count++ ;
            }
            if (temp1 == null) {
                head.next = temp2 ;
            } else {
                head.next = temp1 ;
            }
        }
    }
}
