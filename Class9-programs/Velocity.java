// A program to calculate and display the final velocity.
import java.util.*;
public class Velocity {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the initial velocity(u): ");
            double u = in.nextDouble();
            System.out.print("Enter the acceleration(a): ");
            double a = in.nextDouble();
            System.out.print("Enter the distance covered(s): ");
            double s = in.nextDouble();
            // Calculation
            double value = u * u + 2 * a * s;
            // Condition
            if (u >= 0  && s>=0 && value >= 0) {
                // Calculation
                double velocity = Math.sqrt(value);
                // Output
                System.out.println("Initial velocity(u): " + u);
                System.out.println("Acceleration(a): " + a);
                System.out.println("Distance covered(s): " + s);
                System.out.println("Final velocity: " + velocity);
            }
            else {
                System.out.println("Invalid Input! The given values do not produce a real final velocity.");
            }
        }
    }
}