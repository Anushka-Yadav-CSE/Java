// To calculate the difference between Compound Interest and Simple Interest.
import java.util.*;
public class Interest {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the principal amount: ");
            double principal = in.nextDouble();
            System.out.print("Enter the rate of interest: ");
            double rate = in.nextDouble();
            System.out.print("Enter the time period in years: ");
            double time = in.nextDouble();
            // Condition
            if (principal > 0 && rate > 0 && time > 0) {
                // Calculation
                double si = (principal * rate * time) / 100.0;
                double amount = principal * Math.pow((1 + rate / 100.0),time);
                double ci = amount - principal;
                // Output
                System.out.println("Simple Interest: " + si);
                System.out.println("Compound Interest: " + ci);
                // Condition 
                if (si > ci) {
                    double diff = si - ci;
                System.out.println("Simple Interest is greater and their difference is " + diff);
                }
                else {
                    double diff = ci - si;
                    System.out.println("Compound Interest is greater and their difference is " + diff);
                }
            }
            else {
                System.out.println("INVALID INPUT. Principal amount, time and rate must be greater than zero.");
            }
        }
    }
}