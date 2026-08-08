// A program to find the greatest of 3 numbers.
import java.util.*;
public class GreatestNumber1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the first number: ");
            double a = in.nextDouble();
            System.out.print("Enter the second number: ");
            double b = in.nextDouble();
            System.out.print("Enter the third number: ");
            double c = in.nextDouble();
            // Calculation
            double max = Math.max(Math.max(a, b), c);
            // Output
            System.out.println("The greatest of the three numbers is " + max);
        }
    }
}