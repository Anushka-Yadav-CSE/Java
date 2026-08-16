// A program to calculate and display the discount and commission.
import java.util.*;
public class DiscountCommission {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the name of the policy holder: ");
            String name = in.nextLine();
            System.out.print("Enter the sum assured: ");
            double sum = in.nextDouble();
            System.out.print("Enter the first annual premium: ");
            double annualPremium = in.nextDouble();
            // Output
            System.out.println("Name of the policy holder: " + name);
            System.out.println("Sum assured: " + sum);
            System.out.println("Premium: " + annualPremium);
            // Condition
            if (sum > 0 && annualPremium > 0) {
                if (sum <= 100000) {
                    // Calculation
                    double discount = annualPremium * 5.0 / 100.0;
                    double commission = sum * 2.0 / 100.0;
                    // Output
                    System.out.println("Discount on the first premium: " + discount);
                    System.out.println("Commission of the agent: " + commission);
                }
                else if (sum <= 200000) {
                    // Calculation
                    double discount = annualPremium * 8.0 / 100.0;
                    double commission = sum * 3.0 / 100.0;
                    // Output
                    System.out.println("Discount on the first premium: " + discount);
                    System.out.println("Commission of the agent: " + commission);
                }
                else if (sum <= 500000) {
                    // Calculation
                    double discount = annualPremium * 10.0 / 100.0;
                    double commission = sum * 5.0 / 100.0;
                    // Output
                    System.out.println("Discount on the first premium: " + discount);
                    System.out.println("Commission of the agent: " + commission);
                }
                else {
                    // Calculation
                    double discount = annualPremium * 15.0 / 100.0;
                    double commission = sum * 7.5 / 100.0;
                    System.out.println("Discount on the first premium: " + discount);
                    System.out.println("Commission of the agent: " + commission);
                }
            }
            else {                
                System.out.println("Invalid Input! sum and annual premium must be greater than zero.");
            }
        }
    }
}