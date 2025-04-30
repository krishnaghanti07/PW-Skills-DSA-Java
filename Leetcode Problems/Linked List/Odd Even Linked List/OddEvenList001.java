package Leetcode Problems.Linked List.Odd Even Linked List;

public class OddEvenList001 {
    class Solution {
        public ListNode oddEvenList(ListNode head) {
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
            temp2.next = null ;  // required to avoid Cycle
            temp1.next = dummy2.next ;
    
            return dummy1.next ;
        }
    }
}
