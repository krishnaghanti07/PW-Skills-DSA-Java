package Leetcode Problems.Linked List.Odd Even Linked List;

public class OddEvenLinkedList002 {
    class Solution {
        public ListNode oddEvenList(ListNode head) {
    
            if (head == null || head.next == null) return head;
    
            ListNode oddHead = head;
            ListNode evenHead = head.next;
            ListNode odd = oddHead;
            ListNode even = evenHead;
    
            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
    
            return oddHead;
        }
    }
}
