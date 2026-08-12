// A program to display the sum and product of the numbers.
import java.util.*;
public class NumberCharacter {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the numbers: ");
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            System.out.print("Enter the character: ");
            char d = in.next().charAt(0);
            // Condition
            if (d == 's') {
                // Calculation
                double sum = a + b + c;
                // Output
                System.out.println("Sum of the numbers: " + sum);
            }
            else if (d == 'p') { 
                // Calculation
                double product = a * b * c;
                // Output
                System.out.println("Product of the numbers: " + product);
            }
            else {
                // Output
                System.out.println("Invalid Character!");
            }
        }
    }
}