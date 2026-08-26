// A program to display the secong smallest number without using if-else and ternary operators.
import java.util.*;
public class SecondSmallest1 {
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
            if (a != b && b!= c && c != a) {
                // Calculation
                double sum = a + b + c;
                double max = Math.max(a, Math.max(b, c));
                double min = Math.min(a, Math.min(b, c));
                double secondSmallest = sum - max - min;
                // Output
                System.out.println("The second smallest number is " + secondSmallest);
            }
            else {
                // Output
                System.out.println("Invalid Input! The numbers must be unequal.");
            }
        }
    }
}