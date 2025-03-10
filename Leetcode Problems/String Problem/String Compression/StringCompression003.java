// package Leetcode Problems.String Problem.String Compression;

public class StringCompression003 {
    class Solution {
        public int compress(char[] arr) {
            int n = arr.length ;
            StringBuilder sb = new StringBuilder("") ;
            int i = 0 , j = 0 ;
            while (j < n) {
                if (arr[i] == arr[j]) j++ ;
                else {
                    sb.append(arr[i]) ;
                    int len = j-i ;
                    if (len > 1) sb.append(len) ;
                    i = j ;
                }
            }
            sb.append(arr[i]) ;
            int len = j-i ;
            if (len > 1) sb.append(len) ;
            for (i=0 ; i<sb.length() ; i++) {
                arr[i] = sb.charAt(i) ;
            }
            return sb.length() ;
        }
    }
}
