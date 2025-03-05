// package Basics.Area of Circle;
import java.util.*;

public class AreaofCircle {
    static double pi = 3.14 ;

    public static double areaCir(double r) {
        return (pi*r*r) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the radious of the circle : ");
        double r = sc.nextDouble();
        System.out.println();

        double area = areaCir(r) ;
        System.out.printf("The Area of The Circle is : %.2f" , area);        
    }
}
