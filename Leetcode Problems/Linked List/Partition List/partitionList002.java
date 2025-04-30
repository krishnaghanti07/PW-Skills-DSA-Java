package Leetcode Problems.Linked List.Partition List;

public class partitionList002 {
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode dummy1 = new ListNode(0) ;
            ListNode dummy2 = new ListNode(1) ;
    
            ListNode temp = head ;
            ListNode temp1 = dummy1 ;
            ListNode temp2 = dummy2 ;
    
            while (temp != null) {
                if (temp.val < x) {
                    temp1.next = temp ;
                    temp1 = temp1.next ;
                } else {
                    temp2.next = temp ;
                    temp2 = temp2.next ;
                }
                temp = temp.next ;
            }
            temp2.next = null ; // To avoid Cycle 
            temp1.next = dummy2.next ;
    
            return dummy1.next ;
        }
    }
}
