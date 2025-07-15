// package Collage_Wallah_DSA.Stack.InOrder;

import java.util.*;

public class StackInorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        String str = "9-(5+3)*4/6" ;  // "9-5+3*4/6"

        Stack<Integer> val = new Stack<>() ;
        Stack<Character> operator = new Stack<>() ;

        for (int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i) ;
            int ascii = (int)ch ;

            if (ascii>=48 && ascii<=57) 
                val.push(ascii-48) ;
            else if ( operator.size()==0 || ch=='(' || operator.peek()=='(' ) 
                operator.push(ch) ; 
            else if ( ch==')' ) {
                while ( operator.peek()!='(' ) {
                    // Work
                    int v2 = val.pop() ;
                    int v1 = val.pop() ;

                    if (operator.peek()=='-') val.push(v1-v2) ;
                    if (operator.peek()=='+') val.push(v1+v2) ;
                    if (operator.peek()=='*') val.push(v1*v2) ;
                    if (operator.peek()=='/') val.push(v1/v2) ;

                    operator.pop() ;
                }
                operator.pop() ; // Removing The "Opening Bracket"
            }
            else {
                if (ch=='+' || ch=='-') {
                    // Work
                    int v2 = val.pop() ;
                    int v1 = val.pop() ;

                    if (operator.peek()=='-') val.push(v1-v2) ;
                    if (operator.peek()=='+') val.push(v1+v2) ;
                    if (operator.peek()=='*') val.push(v1*v2) ;
                    if (operator.peek()=='/') val.push(v1/v2) ;

                    operator.pop() ;
                    // Push
                    operator.push(ch) ;
                }
                else if (ch=='*' || ch=='/') {
                    if (operator.peek()=='*' || operator.peek()=='/') {
                        // Work
                        int v2 = val.pop() ;
                        int v1 = val.pop() ;

                        if (operator.peek()=='*') val.push(v1*v2) ;
                        if (operator.peek()=='/') val.push(v1/v2) ;

                        operator.pop() ;
                        // Push
                        operator.push(ch) ;
                    }
                    else {
                        // Direct Push
                        operator.push(ch) ;
                    }
                }
            }
        }
        while (val.size() > 1) {
            // Work
            int v2 = val.pop() ;
            int v1 = val.pop() ;

            if (operator.peek()=='-') val.push(v1-v2) ;
            if (operator.peek()=='+') val.push(v1+v2) ;
            if (operator.peek()=='*') val.push(v1*v2) ;
            if (operator.peek()=='/') val.push(v1/v2) ;

            operator.pop() ;
        }
        System.out.println("The Result is : " + val.peek());
    }
}
