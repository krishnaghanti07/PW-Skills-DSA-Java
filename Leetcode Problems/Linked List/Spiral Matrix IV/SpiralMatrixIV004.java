package Leetcode Problems.Linked List.Spiral Matrix IV;

public class SpiralMatrixIV004 {
    class Solution {
        public int[][] spiralMatrix(int m, int n, ListNode head) {
            int[][] arr = new int[m][n] ;
            ListNode temp = head ;
    
            for (int i=0 ; i<m ; i++) {
                for (int j=0 ; j<n ; j++) {
                    arr[i][j] = -1 ;
                }
            }
            int tr=0 , br=m-1 , lc=0 , rc=n-1 ;
    
            while (temp != null) {
                for (int i=lc ; i<=rc && temp!=null ; i++) {
                    arr[tr][i] = temp.val ;
                    temp = temp.next ;
                }
                tr++ ;
                for (int i=tr ; i<=br && temp!=null ; i++) {
                    arr[i][rc] = temp.val ;
                    temp = temp.next ;
                }
                rc-- ;
                if (tr <= br) {
                    for (int i=rc ; i>=lc && temp!=null ; i--) {
                        arr[br][i] = temp.val ;
                        temp = temp.next ;
                    }
                    br-- ;
                }
                if (lc <= rc) {
                    for (int i=br ; i>=tr && temp!=null ; i--) {
                        arr[i][lc] = temp.val ;
                        temp = temp.next ;
                    }
                    lc++ ;
                }
            }
            return arr ;
        }
    }
}
