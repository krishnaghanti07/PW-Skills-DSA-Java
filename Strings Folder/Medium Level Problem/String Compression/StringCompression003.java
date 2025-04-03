// package Strings Folder.Medium Level Problem.String Compression;
import java.util.*;

public class StringCompression003 {
    public static void printArr(char[] arr , int len) {
        for (int i=0 ; i<len ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int compresStr(char[] arr) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The length of the character array : ");
        int n = sc.nextInt() ;
        char[] arr = new char[n] ;
        for (int i=0 ; i<n ; i++) {
            System.out.print("Enter the "+(i+1)+"-th chacater : ");
            arr[i] = sc.next().charAt(0) ;
        }

        int ans = compresStr(arr) ;
        System.out.println("The Answer Array will be : ");
        printArr(arr , ans) ;
    }
}
