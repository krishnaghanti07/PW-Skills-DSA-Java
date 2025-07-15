// package Collage_Wallah_DSA.Stack.PreOrder Evaluation;

import java.util.*;

public class PreOrderEval {
    public static void main(String[] args) {
        
        String str = "-9/*+5346" ;
        Stack<Integer> st = new Stack<> () ;

        int n = str.length() ;

        for (int i=n-1 ; i>=0 ; i--) {

            char ch = str.charAt(i) ;
            int ascii = (int)ch ;

            if (ascii>=48 && ascii<=57) {
                st.push(ascii-48) ;
            }
            else {
                int v1 = st.pop() ;
                int v2 = st.pop() ;

                if (ch=='+') st.push(v1+v2) ;
                if (ch=='-') st.push(v1-v2) ;
                if (ch=='*') st.push(v1*v2) ;
                if (ch=='/') st.push(v1/v2) ;
            }
        }

        System.out.println("The Result is : " + st.peek());
    }
}
