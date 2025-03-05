// package Conditionals and Loops.Loops.Multiplication Table;
import java.util.* ;

public class MultiplicationTableofNum001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for (int i=1 ; i<=10 ; i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
