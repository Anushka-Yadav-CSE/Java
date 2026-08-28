// A program to input ten different numbers and display the sum of only odd numbers from them.
import java.util.*;
public class Sum1 {
    public static void main(String[] args) {  
        try (Scanner in = new Scanner(System.in)) {
            double sum = 0;
            // For Loop
            for (int i = 0; i < 10; i++) {
                // Input
                System.out.println("Enter the number one by one: ");
                int n = in.nextInt();
                // Condition
                if (n % 2 != 0) {
                    // Calculation
                    sum = sum + n;
                }
            }
            // Output
            System.out.println("Sum = " + sum);
        }
    }
}
                