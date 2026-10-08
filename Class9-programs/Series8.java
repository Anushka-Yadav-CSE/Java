// A program to display the sum of the series:
// S = 1 + (1 * 2) + (1 * 2 * 3) + ...  + (1 * 2 * 3 * ... * n)
import java.util.*;
public class Series8 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Taking input from the user.
            System.out.print("Enter the value of n: ");
            int n = in.nextInt();
            int f, s = 0;
            // Loops to calculate the sum of the series.
            for (int i = 1; i <= n; i++) {
                f = 1;
                for (int j = 1; j <= i; j++) {
                    f = f * j;
                }
                s = s + f;
            }
            // Printing the result.
            System.out.println("Sum of the Series S = " + s);            
        }
    }
}