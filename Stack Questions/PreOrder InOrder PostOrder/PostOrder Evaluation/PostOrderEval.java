// package Collage_Wallah_DSA.Stack.PostOrder Evaluation;

import java.util.*;

public class PostOrderEval {
    public static void main(String[] args) {
        
        String str = "953+4*6/-" ;
        Stack<Integer> st = new Stack<> () ;

        for (int i=0 ; i<str.length() ; i++) {

            char ch = str.charAt(i) ;
            int ascii = (int)ch ;

            if (ascii>=48 && ascii<=57) {
                st.push(ascii-48) ;
            }
            else {
                int v2 = st.pop() ;
                int v1 = st.pop() ;

                if (ch=='+') st.push(v1+v2) ;
                if (ch=='-') st.push(v1-v2) ;
                if (ch=='*') st.push(v1*v2) ;
                if (ch=='/') st.push(v1/v2) ;
            }
        }

        System.out.println("The Result is : " + st.peek());
    }
}

