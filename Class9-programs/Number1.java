// A program to display square and cube of the numbers.
import java.util.*;
public class Number1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the first number: ");
            double a = in.nextDouble();
            System.out.print("Enter the second number: ");
            double b = in.nextDouble();
            // Condition
            if (a > b) {
                // Calculation
                double cube = a * a * a;
                double square = b * b;
                // Output
                System.out.println("Cube of the first number is " + cube);
                System.out.println("Square of the second number is " + square);
            }
            else if (a == b) {
                System.out.println("Both the numbers are equal.");
            }
            else {
                // Calculation
                double square = a * a;
                double cube = b * b * b;
                // Output
                System.out.println("Square of the first number is " + square);
                System.out.println("Cube of the second number is " + cube);
            }
        }
    }
}