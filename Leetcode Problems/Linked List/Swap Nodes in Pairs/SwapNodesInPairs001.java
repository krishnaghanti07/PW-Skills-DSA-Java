package Leetcode Problems.Linked List.Swap Nodes in Pairs;

public class SwapNodesInPairs001 {
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head==null || head.next==null) return head ;
    
            ListNode dummy1 = new ListNode(0) ;
            ListNode dummy2 = new ListNode(1) ;
    
            int idx = 1 ;
            ListNode temp = head ;
            ListNode temp1 = dummy1 ;
            ListNode temp2 = dummy2 ;
    
            while (temp != null) {
                if (idx%2 == 1) {
                    temp1.next = temp ;
                    temp1 = temp1.next ;
                } else {
                    temp2.next = temp ;
                    temp2 = temp2.next ;
                }
                temp = temp.next ;
                idx++ ;
            }
            temp1.next = null ;
            temp2.next = null ;
    
            ListNode newHead = new ListNode(0) ;
            temp = newHead ;
            temp1 = dummy1.next ;
            temp2 = dummy2.next ;
    
            while (temp1!=null && temp2!=null) {
                temp.next = temp2 ;
                temp2 = temp2.next ;
                temp = temp.next ;
                
                temp.next = temp1 ;
                temp1 = temp1.next ;
                temp = temp.next ;
            }
            if (temp1 == null) {
                temp.next = temp2 ;
            } else {
                temp.next = temp1 ;
            }
    
            return newHead.next ;
        }
    }
}
