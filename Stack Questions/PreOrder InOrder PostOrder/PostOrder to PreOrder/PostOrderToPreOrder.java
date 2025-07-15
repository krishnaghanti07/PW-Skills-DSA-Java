// package Collage_Wallah_DSA.Stack.PostOrder to PreOrder;

import java.util.*;

public class PostOrderToPreOrder {
    public static void main(String[] args) {
        
        String str = "953+4*6/-" ;
        Stack<String> st = new Stack<>() ;

        int n = str.length() ;

        for (int i=0 ; i<n ; i++) {
            char ch = str.charAt(i) ;

            // int ascii = (int)ch ;

            if (ch>='0' && ch<='9') {
                // st.push((String)(ascii-48)) ;
                st.push(String.valueOf(ch));
            } else {
                String v2 = st.pop();
                String v1 = st.pop();

                String expr = ch + v1 + v2;
                st.push(expr) ;
            }
        }

        String res = st.pop() ;

        System.out.println("The Result is : " + res);
    }
}

