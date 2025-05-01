package Leetcode Problems.String Problem.String Compression;

public class AddTwoStrings002 {
    class Solution {
        public String addStrings(String num1, String num2) {
            int p1 = Integer.parseInt(num1) ;
            int p2 = Integer.parseInt(num2) ;
    
            int sum = p1+p2 ;
            return Integer.toString(sum) ;
        }
    }
}
