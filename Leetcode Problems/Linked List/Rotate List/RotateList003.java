package Leetcode Problems.Linked List.Rotate List;

public class RotateList003 {
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head==null || head.next==null || k==0) return head ;
            ListNode temp = head ;
            int len = 0 ;
            while (temp != null) {
                len++ ;
                temp = temp.next ;
            }
            k = k % len ;
            if (k == 0) return head ;
    
            ListNode slow = head ;
            ListNode fast = head ;
    
            for (int i=1 ; i<=k ; i++) {
                fast = fast.next ;
            }
            while (fast.next != null) {
                fast = fast.next ;
                slow = slow.next ;
            }
            ListNode newHead = slow.next ;
            slow.next = null ;
            fast.next = head ;
    
            return newHead ;
        }
    
        // public ListNode rotateRight(ListNode head, int k) {
        //     if (head==null || head.next==null || k==0) return head ;
    
        //     int len = 1 ;
        //     ListNode tail = head ;
        //     while (tail.next != null) {
        //         len++ ;
        //         tail = tail.next ;
        //     }
        //     k = k % len ;
        //     if (k == 0) return head ;
    
        //     ListNode newTail = head ;
        //     for (int i=1 ; i<len-k ; i++) {
        //         newTail = newTail.next ;
        //     }
        //     ListNode newHead = newTail.next ;
        //     newTail.next = null ;
        //     tail.next = head ;
    
        //     return newHead ;
        // }
    }
}
