// A program to calculate and display Term Deposit and Recurring Deposit as per the user's choice.
import java.util.*;
public class Deposit {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.println("Enter 1 for Term Deposit.");
            System.out.println("Enter 2 for Recurring Deposit.");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Switch case
            switch(choice) {
                case 1 -> {
                    // Input
                    System.out.print("Enter the principal amount: ");
                    double principal = in.nextDouble();
                    System.out.print("Enter the rate of interest: ");
                    double rate = in.nextDouble();
                    System.out.print("Enter the time period in years: ");
                    double time = in.nextDouble();
                    // Condition
                    if (principal >= 0 && rate >= 0 && time >= 0) {
                        // Calculation
                        double maturityAmount = principal * Math.pow((1 + (rate / 100.0)), time);
                        // Output
                        System.out.println("Maturity Amount = " + maturityAmount);
                    }                
                    else {
                        // Output
                        System.out.println("Invalid Input! Principal, rate and time must be greater than or equal to zero.");
                    }
                }
                case 2 -> {
                    // Input
                    System.out.print("Enter the monthly instalment: ");
                    double instalment = in.nextDouble();
                    System.out.print("Enter the rate of interest: ");
                    double rate = in.nextDouble();
                    System.out.print("Enter the time period in months: ");
                    double time = in.nextDouble();
                    // Condition
                    if (instalment >= 0 && rate >= 0 && time >= 0) {
                        // Calculation
                        double maturityAmount = (instalment * time) + ((time * (time + 1)) / 2) * (rate / 100.0) * (1.0 / 12.0);
                        // Output
                        System.out.println("Maturity Amount = " + maturityAmount);
                    }                
                    else {
                        // Output                    
                        System.out.println("Invalid Input! Instalment, rate and time must be greater than or equal to zero.");
                    }
                }
                default -> {
                    // Output
                    System.out.println("Invalid Choice.");
                }
            }
        }
    }
}