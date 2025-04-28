package Leetcode Problems.Linked List.Sort List (using Merge-Sort);

public class SortaLinkedList002 {
    class Solution {
        public ListNode merge(ListNode h1 , ListNode h2) { // Merge-Sort-Logic
            ListNode dummy = new ListNode(0) ;
    
            ListNode temp = dummy ; // Use the Dummy-Node concept
            ListNode temp1 = h1 ;
            ListNode temp2 = h2 ;
    
            while (temp1!=null && temp2!=null) { // merging-logic
                if (temp1.val <= temp2.val) {
                    temp.next = temp1 ;
                    temp1 = temp1.next ;
                } else {
                    temp.next = temp2 ;
                    temp2 = temp2.next ;
                }
                temp = temp.next ;
            }
            if (temp1 == null) {
                temp.next = temp2 ;
            } else {
                temp.next = temp1 ;
            }
            return dummy.next ;
        }
    
        public ListNode sortList(ListNode head) {
            if (head==null || head.next==null) return head ; // For Empty-List or Single-Node
    
            ListNode firstHalf = head ; // use Two-Pointer Approach
            ListNode slow = head ;
            ListNode fast = head ;
    
            while (fast.next!=null && fast.next.next!=null) {
                slow = slow.next ;
                fast = fast.next.next ;
            }
            ListNode secondHalf = slow.next ; // Break the List into Two Part
            slow.next = null ;
    
            firstHalf = sortList(firstHalf) ; // Sort those two-part
            secondHalf = sortList(secondHalf) ;
    
            ListNode ans = merge(firstHalf, secondHalf) ; // Apply Merge-Sort Logic
            return ans ;
        }
    }
}
