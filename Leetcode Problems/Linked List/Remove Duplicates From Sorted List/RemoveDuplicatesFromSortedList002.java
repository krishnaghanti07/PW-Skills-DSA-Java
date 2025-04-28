// package Leetcode Problems.Linked List.Remove Duplicates From Sorted List;

public class RemoveDuplicatesFromSortedList002 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head==null || head.next==null) return head ;
    
            ListNode dummy = new ListNode(0) ;
            dummy.next = head ;
    
            ListNode prev = dummy ;
            ListNode curr = head ;
    
            while (curr != null) {
                if (curr.next!=null && curr.val==curr.next.val) {
                    while (curr.next!=null && curr.val==curr.next.val) {
                        curr = curr.next ;
                    }
                    prev.next = curr.next ;
                } else {
                    prev = curr ;
                }
                curr = curr.next ;
            }
            return dummy.next ;
        }
    
        // public ListNode deleteDuplicates(ListNode head) { // Single Pointer Approach
        //     if (head==null || head.next==null) return head ;
    
        //     ListNode dummy = new ListNode(101) ;
        //     dummy.next = head ;
    
        //     ListNode temp = dummy ;
        //     while (temp.next!=null && temp.next.next!=null) {
        //         if (temp.next.val == temp.next.next.val) {
        //             int duplicateVal = temp.next.val ;
        //             while (temp.next!=null && temp.next.val==duplicateVal) {
        //                 temp.next = temp.next.next ;
        //             }
        //         } else {
        //             temp = temp.next ;
        //         }
        //     }
        //     return dummy.next ;
        // }
    }
}
