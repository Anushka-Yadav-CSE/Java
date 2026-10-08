// A program to display the sum of the given series:
// S = 1 + 1 / 2! + 1 / 3! + 1 / 4! + ............ + 1 / n!
import java.util.*;
public class Series6 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int f; double s = 0.0;
            // Taking input from the user.
            System.out.print("Enter the value of n: ");
            int n = in.nextInt();
            // Loops to find and display the series.
            for (int i = 1; i <= n; i++) {
                f = 1;
                for (int j = 1; j <= i; j++) {
                    f = f * j;
                }
                s = s + 1.0 / (double) f;
            }
            System.out.println("Sum of the Series S = " + s);
        }
    }
}