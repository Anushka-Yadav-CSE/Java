// A program to input 10 different numbers and display the sum of only negative numbers.
import java.util.*;
public class SumNegative {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double sum = 0;
            // For Loop
            for (int i = 0; i < 10; i++) {
                // Input
                System.out.println("Enter the numbers one by one: ");
                int n = in.nextInt();
                // Condition
                if (n < 0) {                    
                    // Calculation
                    sum = sum + n;
                }
            }
            // Output
            System.out.println("Sum of only negative numbers = " + sum);
        }
    }
}