// A program to find and display the sum of the series s = 1 + 1*2 + 1*2*3 + ..... + 1*2*3..*n.
import java.util.*;
public class Series3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the value of n: ");
            int n = in.nextInt();
            int p = 1, s = 0;
            // for loop
            for (int i = 1; i <=n; i++) {
                // Calculation
                p = p * i;
                s = s + p;
            }
            // Output
            System.out.println("s = " + s);
        }
    }
}