// package Leetcode Problems.Linked List.Linked List Cycle;

public class LinkedListCycle001 {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode fast = head ; // Initialize Slow & Fast Pointer
            ListNode slow = head ;
    
            if (fast==null || fast.next==null) return false ; // if Empty-List or Single-Node
    
            while (fast!=null && fast.next!=null) { // Travarsal Logic
                fast = fast.next.next ;
                slow = slow.next ;
    
                if (fast == slow) return true ; // if Slow & Fast colided (Loop-Detected)
            }
            return false ;  // (if no colision is there) No Loop is Detected
        }
    }
}
