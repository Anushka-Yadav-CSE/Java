// A program to display the equivalent resistance of series and parallel connections as per the user's choice.
import java.util.*;
public class Resistance {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the value of r1: ");
            double r1 = in.nextDouble();
            System.out.print("Enter the value of r2: ");
            double r2 = in.nextDouble();
            System.out.println("Enter 1 to find the equivalent resistance in series.");
            System.out.println("Enter 2 to find the equivalent resistance in parallel.");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Switch case
            switch(choice) {
                case 1 -> {
                    // Calculation
                    double resistance = r1 + r2;
                    System.out.println("Equivalent Resistance(Series): " + resistance);
                }
                case 2 -> {
                    // Condition
                    if (r1 + r2 !=0) {
                        // Calculation
                        double resistance= r1 * r2 / (r1 + r2);
                        // Output
                        System.out.println("Equivalent Resistance(Parallel): " + resistance);
                    }
                    else {
                        // Output
                        System.out.println("Invalid Input! r1 + r2 must not be zero.");
                    }
                }
                default -> {
                    // Output
                    System.out.println("Wrong Choice!");
                }
            }
        }
    }
}