// package Linked List.Basic Declaration;

public class BasicLinkedList002 {

    public static class Node {
        int data ;
        Node next ;

        Node (int val) {
            this.data = val ;
            this.next = null ;
        }
    }

    public static class LinkedList {
        Node head = null ;
        Node tail = null ;
        int current_size = 0 ;

        public void insert_At_First (int val) {
            Node new_node = new Node(val) ;

            if (head == null) {  // if the Linked-List is Empty
                head = new_node ;
                tail = new_node ;
                current_size++ ;
                return ;
            }
            new_node.next = head ;  // if the Linked-List is not Empty
            head = new_node ;

            current_size++ ;
        }

        public void insert_At_Position (int idx, int val) {
            Node new_node = new Node(val) ;

            if (idx<0 || idx>current_size) {  // if the index is out of Bound
                System.out.println("Error : Invalid index ..!!");
                return ;
            }

            if (idx == 0) {  // if the index is : Zero
                insert_At_First(val);
                return ;
            }

            if (idx == current_size) {  // if the index is : current-size
                insert_At_Last(val);
                return ;
            }

            Node prev = head ;
            int count = 0 ;  // if the index is in-between the range

            while (count < idx-1) {
                prev = prev.next ;
                count++ ;
            }
            new_node.next = prev.next ;
            prev.next = new_node ;

            current_size++ ;
        }

        public void insert_At_Last (int val) {
            Node new_node = new Node(val) ;

            if (tail == null) {  // if the Linked-List is Empty
                head = new_node ;
                tail = new_node ;
                current_size++ ;
                return ;
            }
            tail.next = new_node ;  // if the Linked-List is not Empty
            tail = new_node ;

            current_size++ ;
        }

        public void delete_At_First () {
            if (head == null) {  // if the Linked-List is Empty
                System.out.println("Error : Linked-List is already Empty ..!!");
                return ;
            }

            Node temp = head ;  // if the Linked-List is not Empty
            head = head.next ;
            temp.next = null ;

            if (head == null) {  // if the head is currently pointing to null
                tail = null ;
            }

            current_size-- ;
        }

        public void delete_At_Position (int idx) {
            if (idx<0 || idx>=current_size) {  // if the index is out of Bound
                System.out.println("Error : Invalid index ..!!");
                return ;
            }

            if (idx == 0) {  // if the index is : Zero
                delete_At_First();
                return ;
            }

            if (idx == current_size-1) {  // if the index is : current_size-1
                delete_At_Last();
                return ;
            }

            Node prev = head ;  // if the index is in-between the range
            int count = 0 ;
            while (count < idx-1) {
                prev = prev.next ;
                count++ ;
            }
            Node temp = prev.next ;
            prev.next = temp.next ;
            temp.next = null ;

            current_size-- ;
        }

        public void delete_At_Last () {
            if (tail == null) {  // if the Linked-List is Empty
                System.out.println("Error : Linked-List is already Empty ..!!");
                return ;
            }

            if (head == tail) { // if there is only one Node
                head = null ;
                tail = null ;
                current_size-- ;
                return ;
            }

            Node prev = head ;  // if the Linked-List is not Empty
            while (prev.next.next != null) {
                prev = prev.next ;
            }
            prev.next = null ;
            tail = prev ;

            current_size-- ;
        }

        public void get_Element_At_Position (int idx) {
            if (idx<0 || idx>=current_size) {  // if the index is out of Bound
                System.out.println("Error : Invalid index ..!!");
                return ;
            }

            Node prev = head ;  // if the index is in-between the range
            int count = 0 ;
            while (count < idx) {
                prev = prev.next ;
                count++ ;
            }
            System.out.println("The Element at Position : " + idx + " is : " + prev.data);
        }

        public void display () {
            Node temp = head ;
            while (temp != null) {
                System.out.print(temp.data + "==>");
                temp = temp.next ;
            }
            System.out.print("null");
            System.out.println();
        }

        public int size () {
            return current_size ;
        }
    }

    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
    
        // Insertion at Last
        ll.insert_At_Last(10);
        ll.insert_At_Last(20);
        ll.insert_At_Last(30);
        System.out.print("After inserting at last: ");
        ll.display();
    
        // Insertion at First
        ll.insert_At_First(5);
        ll.insert_At_First(2);
        System.out.print("After inserting at first: ");
        ll.display();
    
        // Insertion at Position
        ll.insert_At_Position(2, 7);  // Inserting 7 at index 2
        ll.insert_At_Position(0, 1);  // Inserting 1 at index 0
        ll.insert_At_Position(ll.size(), 40);  // Inserting at end using size
        System.out.print("After inserting at various positions: ");
        ll.display();
    
        // Deletion at First
        ll.delete_At_First();
        System.out.print("After deleting at first: ");
        ll.display();
    
        // Deletion at Last
        ll.delete_At_Last();
        System.out.print("After deleting at last: ");
        ll.display();
    
        // Deletion at Position
        ll.delete_At_Position(3);  // Deleting node at index 3
        System.out.print("After deleting at index 3: ");
        ll.display();
    
        // Getting element at a given position
        ll.get_Element_At_Position(2);  // Should print element at index 2
    
        // Displaying final size and list
        System.out.println("Final Size of the Linked List: " + ll.size());
        System.out.print("Final Linked List: ");
        ll.display();
    }
    
}
