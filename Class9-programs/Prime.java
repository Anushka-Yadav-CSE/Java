// A program to check whether a number is a prime number or not.
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            int a = in.nextInt();
            int c = 0;
            // for loop
            for (int i = 1; i <= a; i++) {
                // Condition
                if (a % i == 0) {
                    // Calculation
                    c = c + 1;
                }
            }
            if (c == 2) {
                // Output
                System.out.println("The number is a prime number.");
            }
            else {
                // Output
                System.out.println("The number is not a prime number.");
            }
        }
    }
}