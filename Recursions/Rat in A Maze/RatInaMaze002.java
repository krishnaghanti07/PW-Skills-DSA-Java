// package Recursions.Rat in A Maze;

import java.util.*;

public class RatInaMaze002 {
    public static int mazePath(int row, int col, int m, int n) {
        // if (row==m && col==n) return 1 ;
        // if (row>m || col>n) return 0 ;   // --> these two together also be a base-case

        if (row==m || col==n) return 1 ;
        int rightWays = mazePath(row, col+1, m, n);
        int downWays = mazePath(row+1, col, m, n);
        return (rightWays + downWays) ;
    }

    public static int mazePath_II2(int m, int n) { // Flipping the indexing
        if (m==1 || n==1) return 1 ;
        int rightWays = mazePath_II2(m, n-1);
        int downWays = mazePath_II2(m-1, n);
        return (rightWays + downWays) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row number : ");
        int m = sc.nextInt();
        System.out.print("Enter the column number : ");
        int n = sc.nextInt();

        // int ans = mazePath(1, 1, m, n);
        int ans = mazePath_II2(m, n);

        System.out.println("There are total "+ ans +" no of ways for the maze path..!!");
    }
}
