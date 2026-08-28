/* A program to display the sum of any 2 numbers for 10 iterations and negative sum will make the
  program terminate. */
import java.util.*;
public class Sum2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {            
            // For loop
            for (int i = 0; i < 10; i++) {
                // Input
                System.out.print("Enter the first number: ");
                double a = in.nextDouble();
                System.out.print("Enter the second number: ");
                double b = in.nextDouble();
                double sum = a + b;
                // Condition
                if (sum < 0) {
                    break;
                }
                // Output
                System.out.println("Sum of the two numbers is: " + sum);
            }
            // Output
            System.out.println("Program Terminates.");
        }
    }
}