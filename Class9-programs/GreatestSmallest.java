// A program to find and display the smallest and greatest of three unequal numbers.
import java.util.*;
public class GreatestSmallest {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the first number: ");
            double a = in.nextDouble();
            System.out.print("Enter the second number: ");
            double b = in.nextDouble();
            System.out.print("Enter the third number: ");
            double c = in.nextDouble();
            // Condition
            if (a != b && b != c && c != a) {
                // Calculation
                double max = Math.max(a, Math.max(b, c));
                double min = Math.min(a, Math.min(b, c));
                // Output
                System.out.println("The greatest number is " + max);
                System.out.println("The smallest number is " + min);
            }
            else {
                // Output
                System.out.println("Invalid Input! The numbers must be unequal.");
            }
        }
    }
}
