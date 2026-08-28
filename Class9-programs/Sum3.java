// A program to display the sum of all natural numbers from 1 to n.
import java.util.*;
public class Sum3 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int s = 0;
            // Input
            System.out.print("Enter the value of n: ");
            int n = in.nextInt();
            // For Loop
            for (int i = 1; i <= n; i++) {
                // Calculation
                s = i + s;
            }
            // Output
            System.out.println("The sum of natural number upto " + n + " = " + s);
        }
    }
}