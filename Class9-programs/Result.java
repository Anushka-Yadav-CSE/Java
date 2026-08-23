// A program to display the result.
import java.util.*;
public class Result {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the value of a: ");
            double a = in.nextDouble();
            System.out.print("Enter the value of b: ");
            double b = in.nextDouble();
            if (a != b) {
                // Calculation
                double result = ((10 * a + b) + (10 * b + a)) / (a - b);
                // Output
                System.out.println("The result is " + result);
            }
            else {
                System.out.println("Invalid input! The first number should not be equal to the second number.");
            }
        }
    }
}