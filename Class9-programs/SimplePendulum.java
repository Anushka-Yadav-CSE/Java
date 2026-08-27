// To calculate and display the time period of a simple pendulum.
import java.util.*;
public class SimplePendulum {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the length: ");
            double length = in.nextDouble();
            System.out.print("Enter the acceleration due to gravity: ");
            double gravity = in.nextDouble();
            // Condition
            if (gravity > 0 && length > 0) {
                // Calculation
                double timePeriod = 2 * Math.PI * (Math.sqrt (length / gravity));
                // Output
                System.out.println("The time period of the simple pendulum is: " + timePeriod);
            }
            else {
                System.out.println("Invalid input! The value of gravity and length must be positive.");
            }
            }
        }
    }