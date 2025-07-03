// package Leetcode Problems.Stack Problems.Next Greater Element;

public class NextGreaterElement {
    class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length ;
        Stack<Integer> st = new Stack<>() ;
        ArrayList<Integer> ans = new ArrayList<>() ;
        ans.add(-1) ;
        st.push(arr[n-1]) ;
        
        for (int i=n-2 ; i>=0 ; i--) {
            while (!st.isEmpty() && st.peek()<=arr[i]) {
                st.pop() ;
            }
            if (st.isEmpty()) {
                ans.add(-1) ;
            } else {
                ans.add(st.peek()) ; // if (st.peek() > arr[i])
            }
            st.push(arr[i]) ;
        }
        Collections.reverse(ans) ;
        return ans ;
    }
}
}
