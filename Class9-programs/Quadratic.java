// A program to display  the nature of the roots of a quadratic equation.
import java.util.*;
public class Quadratic {
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
            if (a != 0) {
                // Calculation
                double discriminant = b * b - 4 * a * c;
                // Condition
                if (discriminant > 0) {
                    // Output
                    System.out.println("Discriminant = " + discriminant);
                    System.out.println("Roots are real and unequal.");
                }
                else if (discriminant == 0) {
                    // Output
                    System.out.println("Discriminant = " + discriminant);
                    System.out.println("Roots are real and equal.");
                }
                else {
                    // Output
                    System.out.println("Discriminant = " + discriminant);
                    System.out.println("Roots are imaginary and unequal.");
                }
            }
            else {
                System.out.println("Invalid Input! a must not be zero.");
            }
        }
    }
}