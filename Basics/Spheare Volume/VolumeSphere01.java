// package Basics.Spheare Volume;
import java.util.*;

public class VolumeSphere01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double pi = 3.1415 ;

        System.out.print("Enter the radious of the sphere : ");
        double r = sc.nextDouble();

        double vol = (4/3)*pi*(r*r*r) ;

        System.out.printf("The Volume of Sphere will be : %.2f" , vol);
    }
}
