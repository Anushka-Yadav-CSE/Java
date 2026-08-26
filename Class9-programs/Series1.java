// A program to find and display the sum of the series s = 1 - a + a^2 - a^3 + ... + a^10.
import java.util.*;
public class Series1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            double s = 0;
            System.out.print("Enter the value of a: ");
            double a = in.nextDouble();
            // for loop
            for (int i = 0; i <= 10; i++) {
                // Condition
                if(i % 2 != 0) {
                    // Calculation
                    s = s - Math.pow(a,i);
                }
                else {
                    // Calculation
                    s = s + Math.pow(a,i);
                }
            }
            // Output
            System.out.println("s = " + s);
        }
    }
}