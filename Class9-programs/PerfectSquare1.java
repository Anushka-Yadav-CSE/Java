// A program to check whether a number is a perfect square or not and if the number is equal to 0 program terminates.
import java.util.*;
public class PerfectSquare1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // While Loop
            while(true) {            
                // Input    
                System.out.print("Enter a positive integer number: ");
                int n = in.nextInt();
                // Condition
                if (n == 0) {
                    break;
                }
                // Calculation
                int root = (int) Math.sqrt(n);
                // Condition
                if (root * root == n) {
                    // Output
                    System.out.println(n + " is a perfect square.");
                }
                else {
                    // Output
                    System.out.println(n + " is not a perfect square.");
                }
            }
            // Output
            System.out.println("Program Terminates!");
        }
    }
}