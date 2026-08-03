// A program to display the value of expressions.
import java.util.*;
public class Expressions {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
        System.out.print("Enter the value of a: ");
        double a=in.nextDouble();
        System.out.print("Enter the value of b: ");
        double b=in.nextDouble();
        double c=a*a+2*a*b+b*b;
        double d=a*a*a-3*a*a*b+3*a*b*b-b*b*b;
        System.out.println("The value of (a+b)^2 = " + c);
        System.out.println("The value of (a-b)^3 = " + d);
    }
}
}