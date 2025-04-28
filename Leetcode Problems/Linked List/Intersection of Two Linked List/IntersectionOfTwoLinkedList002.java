// package Leetcode Problems.Linked List.Intersection of Two Linked List;

public class IntersectionOfTwoLinkedList002 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode fast = null ; // Initialize the Slow & Fast Pointer
            ListNode slow = null ;
    
            ListNode temp1 = headA ; // Initialize the temp-Pointers 
            ListNode temp2 = headB ; // To determine the length of the Lists
    
            int len1 = 0 ;  // Variables to determine the Length
            int len2 = 0 ;
            int diff = 0 ;
    
            while (temp1 != null) { // Calculating the Length1
                len1++ ;
                temp1 = temp1.next ;
            }
            while (temp2 != null) { // Calculating the Length2
                len2++ ;
                temp2 = temp2.next ;
            }
    
            if (len1 > len2) { // Determine the Slow & Fast pointer
                fast = headA ;
                slow = headB ;
                diff = len1 - len2 ;
            } else {     // Determine the Slow & Fast pointer
                fast = headB ;
                slow = headA ;
                diff = len2 - len1 ;
            }
    
            for (int i=1 ; i<=diff ; i++) { // put the fast-Pointer in such correct-place 
                fast = fast.next ;      // That, the both length become Equal
            }
    
            while (fast!=null && slow!=null && fast!=slow) {
                fast = fast.next ;    // Determining the Intersection_Node
                slow = slow.next ;
            }
            if (fast != slow) {  // Final Check, if No-Intersection
                return null ;
            }
            return slow ;  // return the Intersection-Point
        }
    }
}
