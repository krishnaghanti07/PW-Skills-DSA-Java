// package Collage_Wallah_DSA.Stack.Inorder To Postorder;

import java.util.*;

public class InorderToPostorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        String infix = "9-(5+3)*4/6" ;  // "9-5+3*4/6"
        System.out.println("Infix Expression is : " + infix);

        Stack<String> val = new Stack<>() ;
        Stack<Character> operator = new Stack<>() ;

        for (int i=0 ; i<infix.length() ; i++) {
            char ch = infix.charAt(i) ;
            int ascii = (int)ch ;

            if (ascii>=48 && ascii<=57) {
                String s = "" + ch ; // TypeCast The "Integer" to "String"
                val.push(s) ; // Push The String to The "Val" Stack
            }
            else if ( operator.size()==0 || ch=='(' || operator.peek()=='(' ) 
                operator.push(ch) ; 
            else if ( ch==')' ) {
                while ( operator.peek()!='(' ) {
                    // Work
                    String v2 = val.pop() ;
                    String v1 = val.pop() ;

                    char op = operator.pop() ;

                    String res = v1 + v2 + op ;

                    val.push(res) ;
                }
                operator.pop() ; // Removing The "Opening Bracket"
            }
            else {
                if (ch=='+' || ch=='-') {
                    // Work
                    String v2 = val.pop() ;
                    String v1 = val.pop() ;

                    char op = operator.pop() ;

                    String res = v1 + v2 + op ;

                    val.push(res) ;
                    // Push
                    operator.push(ch) ;
                }
                else if (ch=='*' || ch=='/') {
                    if (operator.peek()=='*' || operator.peek()=='/') {
                        // Work
                        String v2 = val.pop() ;
                        String v1 = val.pop() ;

                        char op = operator.pop() ;

                        String res = v1 + v2 + op ;

                        val.push(res) ;
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
            String v2 = val.pop() ;
            String v1 = val.pop() ;

            char op = operator.pop() ;

            String res = v1 + v2 + op ;

            val.push(res) ;
        }
        String postfix = val.pop() ;
        System.out.println("The Postfix Expression is : " + postfix);
    }
}

