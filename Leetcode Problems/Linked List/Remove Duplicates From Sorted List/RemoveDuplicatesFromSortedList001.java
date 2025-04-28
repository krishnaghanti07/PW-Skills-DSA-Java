package Leetcode Problems.Linked List.Remove Duplicates From Sorted List;

public class RemoveDuplicatesFromSortedList001 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode temp = head ; // Using Single-Pointer
    
            while (temp != null) {
                while (temp.next!=null && temp.val==temp.next.val) {
                    temp.next = temp.next.next ;
                }
                temp = temp.next ;
            }
            return head ;
        }
    
        // public ListNode deleteDuplicates(ListNode head) {
        //     if (head==null || head.next==null) return head ; // If Empty-List or Single-Node
    
        //     ListNode fast = head ; // Initialize the Slow & Fast pointer
        //     ListNode slow = head ;
    
        //     while (fast != null) { // Travarsing 
        //         if (fast.val == slow.val) { // if duplicates detected
        //             fast = fast.next ;
        //         } else {  // if no duplicates is detected
        //             slow.next = fast ;
        //             slow = slow.next ;
        //             fast = fast.next ;
        //         }
        //     }
        //     slow.next = null ; // at the last, connect the slow with null
    
        //     return head ;
        // }
    }
}
