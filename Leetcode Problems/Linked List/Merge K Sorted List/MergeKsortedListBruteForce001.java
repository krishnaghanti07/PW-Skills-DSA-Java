package Leetcode Problems.Linked List.Merge K Sorted List;

public class MergeKsortedListBruteForce001 {
    class Solution {  // Brute-Force Solution
        public ListNode mergeKLists(ListNode[] lists) {
            ArrayList<Integer> values = new ArrayList<>() ; // Create a ArrayList
    
            for (ListNode list: lists) {
                while (list != null) {
                    values.add(list.val) ; // Add all the values of Every Linked-List into the ArrayList
                    list = list.next ;
                }
            }
            Collections.sort(values) ;  // Sort the Whole ArrayList using Built-in Method
    
            ListNode dummy = new ListNode(0) ;
            ListNode temp = dummy ;
    
            for (int value: values) { // Make a new LinkedList out of the ArrayList
                temp.next = new ListNode(value) ;
                temp = temp.next ;
            }
            return dummy.next ; // Return the new LinkedList
        }
    }
}
