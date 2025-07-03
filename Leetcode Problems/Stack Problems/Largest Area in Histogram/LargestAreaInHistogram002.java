public class LargestAreaInHistogram002 {
    class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length ;
        Stack<Integer> st = new Stack<>() ;
        int[] nse = new int[n] ;
        int[] pse = new int[n] ;

        st.push(n-1) ;
        nse[n-1] = n ;
        for (int i=n-2 ; i>=0 ; i--) {
            while (!st.isEmpty() && heights[st.peek()]>=heights[i]) {
                st.pop() ;
            }
            if (st.isEmpty()) {
                nse[i] = n ;
            } else {
                nse[i] = st.peek() ;
            }
            st.push(i) ;
        }
        while (st.size() > 0) st.pop() ; 

        st.push(0) ;
        pse[0] = -1 ;
        for (int i=1 ; i<n ; i++) {
            while (!st.isEmpty() && heights[st.peek()]>=heights[i]) {
                st.pop() ;
            }
            if (st.isEmpty()) {
                pse[i] = -1 ;
            } else {
                pse[i] = st.peek() ;
            }
            st.push(i) ;
        }
        int ans = 0 ;
        for (int i=0 ; i<n ; i++) {
            int res = (heights[i]) * (nse[i] - pse[i] -1) ;
            ans = Math.max(ans, res) ;
        }
        return ans ;
    }
}
}
