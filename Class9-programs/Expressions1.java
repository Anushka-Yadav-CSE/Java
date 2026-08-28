// A program to find and display the value of some expressions.
import java.util.*;
public class Expressions1 {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
        System.out.print("Enter the value of x: ");
        double x=in.nextDouble();
        System.out.print("Enter the value of a: ");
        double a=in.nextDouble();
        System.out.print("Enter the value of b: ");
        double b=in.nextDouble();
        System.out.print("Enter the value of c: ");
        double c=in.nextDouble();
        double y=((x+3)/6)-((2*x+5)/3);
        double d=(a*a + b*b + c*c)/ (a*b*c);
        System.out.println("The answer of 1st expression is " + y);
        System.out.println("The answer of 2nd expression is " + d);
        }
    }
}