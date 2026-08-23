// A program to display the sum of any 10 natural numbers.
import java.util.*;
public class Natural {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int s = 0;
            // for loop
             for (int i = 0; i < 10; i++) {
                // Input
                System.out.println("Enter the natural number: ");
                int n = in.nextInt();
                // Calculation
                s = s + n;                
            }
            // Output
            System.out.println("Sum of any ten natural numbers is: " + s);
        }
    }
}