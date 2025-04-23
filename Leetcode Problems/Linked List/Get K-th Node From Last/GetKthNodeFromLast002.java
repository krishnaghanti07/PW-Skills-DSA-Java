// package Leetcode Problems.Linked List.Get K-th Node From Last;

public class GetKthNodeFromLast002 {
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node fast = head ;
        Node slow = head ;
        
        for (int i=1 ; i<=k ; i++) {
            if (fast == null) return -1 ;
            fast = fast.next ;
        }
        if (fast == null) return head.data ;
        
        while (fast != null) {
            fast = fast.next ;
            slow = slow.next ;
        }
        return slow.data ;
    }
}
