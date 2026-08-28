// A program to input two unequal numbers and swap them without using a third variable.
import java.util.*;
public class Swap1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the first number: ");
            double a = in.nextDouble();
            System.out.print("Enter the second number: ");
            double b = in.nextDouble();
            // Condition
            if (a != b) {
                // Calculation
                a = a + b;
                b = a - b;
                a = a - b;
                // Output
                System.out.println("The first number after being swapped is: " + a);
                System.out.println("The second number after being swapped is: " + b);
            }
            else {
                System.out.println("INVALID INPUT! Both the numbers must not be equal to each other.");
            }
        }
    }
}