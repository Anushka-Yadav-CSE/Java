// A program to find and display the sum of the factorial of the  numbers.
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the value of n: ");
            int n = in.nextInt();
            int s = 0;
            int p =1;
            // for loop
            for (int i = 1; i <= n; i++) {
                // Calculation
                p = p * i;
                s = s + p;
            }
            // Output
            System.out.println("s = " + s);
        }
    }
}