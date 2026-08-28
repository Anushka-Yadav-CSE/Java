// A program to find the greatest and smallest of 10 different numbers.
import java.util.*;
public class GreatestSmallest1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the first number: ");
            int a = in.nextInt();
            int max = a;
            int min = a;
            // for loop
            for (int i = 0; i < 9; i++) {
                // Input
                System.out.print("Enter the next number: ");
                int b = in.nextInt();
                // Condition
                if (max < b) {
                    // Calculation
                    max = b;
                }
                if (min > b) {
                    // Calculation
                    min = b;
                }
            }
            // Output
            System.out.println("The greatest number is " + max);
            System.out.println("The smallest number is " + min);
        }
    }
}