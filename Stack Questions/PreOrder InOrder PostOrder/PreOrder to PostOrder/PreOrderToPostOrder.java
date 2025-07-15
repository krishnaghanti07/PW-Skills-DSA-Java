// package Collage_Wallah_DSA.Stack.PreOrder to PostOrder;

import java.util.*;

public class PreOrderToPostOrder {
    public static void main(String[] args) {
        
        String str = "-9/*+5346" ;
        Stack<String> st = new Stack<>() ;

        int n = str.length() ;

        for (int i=n-1 ; i>=0 ; i--) {
            char ch = str.charAt(i) ;

            // int ascii = (int)ch ;

            if (ch>='0' && ch<='9') {
                // st.push() ;
                st.push(String.valueOf(ch));
            } else {
                String v1 = st.pop();
                String v2 = st.pop();

                String expr = v1 + v2 + ch ;
                st.push(expr) ;
            }
        }

        String res = st.pop() ;

        System.out.println("The Result is : " + res);
    }
}
