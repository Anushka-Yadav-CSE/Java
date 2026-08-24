// A program to find and display the factors of a number(including 1 & excluding the number itself).
import java.util.*;
public class Factor {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            int a = in.nextInt();
            // for loop
            for (int i = 1; i < a; i++) {
                // Condition
                if (a % i == 0) {
                    // Output
                    System.out.println(i + " is a factor of " + a);
                }
            }
        }
    }
}