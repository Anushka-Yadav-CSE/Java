// A program to find profit and profit percent or loss and loss percent.
import java.util.*;
public class Price {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the cost price: ");
            double cp = in.nextDouble();
            System.out.print("Enter the selling price: ");
            double sp = in.nextDouble();
            if (cp > 0 && sp > 0) {
                // Condition
                if (sp > cp) {
                    // Calculation
                    double profit = sp - cp;
                    double profitPercent = (profit / cp) * 100.0;
                    // Output
                    System.out.println("The profit is " + profit);
                    System.out.println("The profit percent is " + profitPercent + "%");
                }
                else if (cp > sp) {
                    // Calculation
                    double loss = cp - sp;
                    double lossPercent = (loss / cp) * 100.0;
                    // Output
                    System.out.println("The loss is " + loss);
                    System.out.println("The loss percent is " + lossPercent + "%");
                }
                else {
                    // Output
                    System.out.println("Both the cost price and selling price are equal.");
                }
            }
            else {
                // Output
                System.out.println("Invalid Input! The cost price and selling price must be greater than zero.");
            }
        }
    }
}