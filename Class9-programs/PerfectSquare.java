// A program to check whether a number is a perfect square.
import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            int number = in.nextInt();
            // Condition
            if (number >= 0) {
                // Calculation
                int root = (int) Math.sqrt(number);
                if (root * root == number) {
                    // Output
                    System.out.println("The number is a perfect square.");
                }
                else {
                    // Output
                    System.out.println("The number is not a perfect square.");
                }
            }
            else {
                // Output
                System.out.println("Invalid Input! The number must be greater than or equal to zero.");
            }
        }
    }
}