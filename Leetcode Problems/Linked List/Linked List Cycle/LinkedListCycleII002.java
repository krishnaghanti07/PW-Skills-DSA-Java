// package Leetcode Problems.Linked List.Linked List Cycle;

public class LinkedListCycleII002 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head ; // Initialize the Slow & Fast pointer
            ListNode slow = head ;
            int count = 0 ;
    
            if (fast==null || fast.next==null) return null ; // If Empty-List or Single-Node
    
            while (fast!=null && fast.next!=null) { // Travarsal Logic
                fast = fast.next.next ;
                slow = slow.next ;
    
                if (fast == slow) break ; // If cycle is Detected
            }
            if (fast != slow) return null ; // If No Cycle is Detected
    
            ListNode temp = head ;
            while (temp != slow) { // Determine the starting-position of Cycle
                count++ ;
                temp = temp.next ;
                slow = slow.next ;
            }
            return slow ;  // Return the position of Cycle-Starting
        }
    }
}
