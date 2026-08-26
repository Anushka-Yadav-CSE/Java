// A program to find and display the sum of the series s = a - a/2 + a/3 - a/4 + .... - a/20;
import java.util.*;
public class Series2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the value of a: ");
            double a = in.nextDouble();
            double s = 0;
            // for loop
            for (int i = 1; i <=20; i++) {
                // Condition
                if (i % 2 != 0) {
                    // Calculation
                    s = s + a / i;
                }
                else {
                    // Calculation
                    s = s - a / i;
            }
        }
        // Output
        System.out.println("s = " + s);
        }
    }
}