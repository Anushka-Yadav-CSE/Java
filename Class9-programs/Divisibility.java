// A program to check whether a number is divisible by 3 and 5.
import java.util.*;
public class Divisibility {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            double number = in.nextDouble();
            // Condition
            if (number % 3 == 0 && number % 5 == 0) {
                // Output
                System.out.println("The number is divisible by both 3 and 5.");
            }
            else if (number % 3 == 0 && number % 5 != 0) {
                // Output
                System.out.println("The number is divisible by 3 but not divisible by 5.");
            }
            else if (number % 3 != 0 && number % 5 == 0) {
                // Output
                System.out.println("The number is divisible by 5 but not divisible by 3.");
            }
            else {
                // Output
                System.out.println("The number is neither divisible by 3 nor by 5.");
            }
        }
    }
}