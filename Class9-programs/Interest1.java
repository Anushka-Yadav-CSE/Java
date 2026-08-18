// A program to calculate and display simple and compound interest as per the user's choice.
import java.util.*;
public class Interest1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the principal amount: ");
            double p = in.nextDouble();
            System.out.print("Enter the rate of interest: ");
            double r = in.nextDouble();
            System.out.print("Enter the time in years: ");
            int t = in.nextInt();
            System.out.println("Enter 1 to calculate the Simple Interest.");
            System.out.println("Enter 2 to calculate the Compound Interest.");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Condition
            if (p > 0 && r > 0 && t > 0) {
                // Switch case
                switch(choice) {
                    case 1 -> {
                        // Calculation
                        double si = p * r * t / 100.0;
                        // Output
                        System.out.println("Simple Interest = " + si);
                    }
                    case 2 -> {
                        // Calculation
                        double ci = p * (Math.pow((1 + (r / 100.0)), t) - 1);                        
                        // Output
                        System.out.println("Compound Interest = " + ci);
                    }
                    default -> {
                        // Output
                        System.out.println("Wrong Choice!");
                    }
                }
            }
            else {
                // Output
                System.out.println("Invalid Input! p, r and t must be greater than zero.");
            }
        }
    }
}