// A program to find and display the value of an expression.
import java.util.*;
public class Expressions2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the value of a: ");
            double a = in.nextDouble();
            System.out.print("Enter the value of b: ");
            double b = in.nextDouble();
            System.out.print("Enter the value of c: ");
            double c = in.nextDouble();
            // Condition
            if (a != 0 && b != 0 && c !=0) {
                // Calculation
                double result =
                 1 / Math.pow(a,2)
                + 1 / Math.pow(b,3)
                + 1 / Math.pow(c,4);
                // Output
                System.out.println("The result of the expression is " + result);
            }
            else {
                System.out.println("Invalid Input! a, b and c must not be equal to zero.");
            }
        }
    }
}