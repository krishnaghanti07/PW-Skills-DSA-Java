import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem02 {
    
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        int n = arr.length ;
        ArrayList<Integer> ans = new ArrayList<>() ;
        Stack<Integer> st = new Stack<>() ;
        
        for (int i=0 ; i<n ; i++) {
            while (!st.isEmpty() && (arr[st.peek()]<=arr[i])) {
                st.pop() ;
            }
            if (st.isEmpty()) {
                ans.add(i + 1) ;
            } else {
                ans.add(i - st.peek()) ;
            }
            st.push(i) ;
        }
        return ans ;
    }
}
}
