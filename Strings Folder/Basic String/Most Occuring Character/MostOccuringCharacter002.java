// package Strings Folder.Basic String.Most Occuring Character;
import java.util.*;

public class MostOccuringCharacter002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String (in lowercase alpabate only): ");
        String str = sc.nextLine();

        int[] arr = new int[26];
        for(int i=0 ; i<str.length() ; i++) {
            arr[(int)(str.charAt(i)-97)] += 1 ;
        }
        int max = -1 ;
        for(int i=0 ; i<26 ; i++) {
            if (arr[i] > max) {
                max = arr[i] ;
            }
        }
        System.out.print("The most occuring elements are : ");
        for (int i=0 ; i<26 ; i++) {
            if (arr[i] == max) {
                System.out.print((char)(i+97) + " ");
            }
        }
    }
}
