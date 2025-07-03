package Leetcode Problems.Stack Problems.Remove All Adjacent Duplicates in String;

public class RemoveAllAdjacentDuplicatesInString002 {
    class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder() ;
        Stack<Character> st = new Stack<>() ;

        for (Character c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek()==c) {
                st.pop() ;
            } else {
                st.push(c) ;
            }
        }
        while (st.size() > 0) ans.append(st.pop()) ;
        return ans.reverse().toString() ;
    }
}
}
