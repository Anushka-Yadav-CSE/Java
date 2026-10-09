// A program to print the sum of the series:
// S = 1 + 1 / (1 + 2) + 1 / (1 + 2 + 3) + ... + 1 / (1 + 2 + 3 + ... + n)
import java.util.*;
public class Series9 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double s = 0.0; int f;
            // Taking input from the user.
            System.out.print("Enter the value of n: ");
            int n = in.nextInt();
            // Loops to calculate the sum of the series.
            for (int i = 1; i <= n; i++) {
                f = 0;
                for (int j = 1; j <= i; j++) {
                    f = f + j;
                }
                s = s + 1.0 / (double) f;
            }
            // Printing the result.
            System.out.println("Sum of the series S = " + s);
        }
    }
}