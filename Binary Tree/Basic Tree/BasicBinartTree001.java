// package Binary Tree.Basic Tree;

public class BasicBinartTree001 {
    
    public static class Node {
        int val ;
        Node left ;
        Node right ;
        Node (int val) {
            this.val = val ;
        }
    }
    // Recursive Method to Print all nodes of the tree
    public static void displayTree(Node a) {
        System.out.println(a.val);
        if (a.left != null) displayTree(a.left) ;
        if (a.right != null) displayTree(a.right) ;
        return ;
    }
    
    public static void display(Node root) {
        if (root == null) return ; // base-Case
        System.out.print(root.val + " ");
        display(root.left); // Left-SubTree
        display(root.right); // Right-SubTree
    }

    // Recursive code to find the Sum of All-Nodes of Binary-Tree
    public static int sumBT(Node root) {
        int sum = 0 ;
        if (root == null) return sum ;
        sum = root.val ;
        sum += sumBT(root.left) ;
        sum += sumBT(root.right) ;
        return sum ;
    }

    // Recursive code to find the Product of All-Nodes of Binary-Tree
    public static int prodBT (Node root) {
        int prod = 1 ;
        if (root == null) return prod ;
        prod = root.val ;
        prod *= prodBT(root.left) ;
        prod *= prodBT(root.right) ;
        return prod ;
    }

    // Recursive code to find the Product of All-Nodes without Zero of a Binary-Tree
    public static int prodWithOutZero (Node root) {
        int prod = 1 ;
        if (root == null) return prod ;
        if (root.val == 0) prod = 1 ;
        else prod = root.val ;
        prod *= prodWithOutZero(root.left) ;
        prod *= prodWithOutZero(root.right) ;
        return prod ;
    }

    // Recursive code to find the Maximum Node-value of a Binary-Tree
    public static int findMaxBT(Node root) {
        int max = Integer.MIN_VALUE ;
        if (root == null) return max ;
        max = root.val ;
        max = Math.max (max , findMaxBT(root.left)) ;
        max = Math.max (max , findMaxBT(root.right)) ;
        return max ;
    }

    // Recursive code to find the Maximum Node-value of a Binary-Tree
    public static int maxBT(Node root) {
        if (root == null) return Integer.MIN_VALUE ;
        return Math.max (root.val , Math.max(maxBT(root.left) , maxBT(root.right))) ;
    }

    // Recursive code to find the Minimum Node-value of a Binary-Tree
    public static int minBT(Node root) {
        if (root == null) return Integer.MAX_VALUE ;
        return Math.min (root.val , Math.min(minBT(root.left) , minBT(root.right))) ;
    }

    public static void main(String[] args) {
        // Create the Nodes
        Node a = new Node(1) ;
        Node b = new Node(4) ;
        Node c = new Node(3) ;
        Node d = new Node(2) ;
        Node e = new Node(6) ;
        Node f = new Node(5) ;

        // Connections
        a.left = b ;
        a.right = c ;
        b.left = d ;
        b.right = e ;
        c.right = f ;

        // // Printing after connections
        // System.out.println(e.val);
        // System.out.println(a.left.right.val);

        // // To print all the nodes of the Tree Recursively
        // displayTree(a) ;
        // display(a);

        // To display the sum of all nodes of the Tree Recursively
        int sum = sumBT(a) ;
        System.out.println("Sum is : " + sum);

        // // To display the product of all nodes of the Tree Recursively
        // int prod = prodBT(a) ;
        int prod = prodWithOutZero(a) ;
        System.out.println("Product is : " + prod);

        // // To display the Max-Value of all nodes of the Tree Recursively
        // int max = findMaxBT(a) ;
        int max = maxBT(a) ;
        System.out.println("The Max value is : " + max);
        // // To display the Min-Value of all nodes of the Tree Recursively
        int min = minBT(a) ;
        System.out.println("The Max value is : " + min);
    }
}
