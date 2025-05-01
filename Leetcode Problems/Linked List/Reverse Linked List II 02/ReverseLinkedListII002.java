package Leetcode Problems.Linked List.Reverse Linked List II 02;

public class ReverseLinkedListII002 {
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
        public ListNode reverseBetween(ListNode head, int left, int right) {
            // if (head.next==null || left==right) return head ;
            if (head.next == null) return head ;
    
            ListNode dummy = new ListNode(0) ; // Creating a dummy node
            dummy.next = head ;
            ListNode p1 = dummy ;
            ListNode p2 = dummy ;
    
            for (int i=1 ; i<left ; i++) { // put the p1 at the previous of left
                p1 = p1.next ;
            }
            for (int i=1 ; i<=right ; i++) { // put the p2 at the next of right
                p2 = p2.next ;
            }
            ListNode t1 = p1.next ; // determine the left
            ListNode t2 = p2.next ; // determine the right
    
            p2.next = null ; // seperate the list before reverse
            ListNode temp = rev(t1) ; // reverse the required part
            p1.next = temp ; 
            t1.next = t2 ; // connecting it properly after reverse
    
            return dummy.next ; // return the new-Head
        }
    }
}
