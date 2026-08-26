// To calculate and display the number of shares.
import java.util.*;
public class Shares {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the nominal value: ");
            double nominalValue = in.nextDouble();
            System.out.print("Enter the rate of dividend: ");
            double rate = in.nextDouble();
            System.out.print("Enter annual dividend: ");
            double annualDividend = in.nextDouble();
            if (nominalValue > 0 && rate > 0 && annualDividend > 0) {
                // Calculation
                double shares = (annualDividend * 100) / (rate * nominalValue);
                // Output
                System.out.println("Number of shares: " + shares);
            }
            else {
                System.out.println("Invalid input!");
                System.out.println("Nominal value and rate of dividend must be greater than zero.");
                System.out.println("Annual dividend must be greater than zero.");
            }
        }
    }
}