// To find and display the total cost price of two calculators.
import java.util.*;
public class CostPrice {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the selling price: ");
            double sp = in.nextDouble();
            System.out.print("Enter the profit percent: ");
            double profitPercent = in.nextDouble();
            System.out.print("Enter the loss percent: ");
            double lossPercent = in.nextDouble();
            // Condition
            if (profitPercent > 0 && lossPercent > 0 && sp > 0 && profitPercent < 100 && lossPercent < 100) {
                double costPrice1 = sp / (1 + profitPercent / 100.0); // CP when sold at profit.
                double costPrice2 = sp / (1 - lossPercent / 100.0); // CP when sold at loss.
                double totalCp = costPrice1 + costPrice2;
                // Output
                System.out.println("Cost price of the first calculator: " + costPrice1);
                System.out.println("Cost price of the second calculator: " + costPrice2);
                System.out.println("Total cost price of both the calculators: " + totalCp);
            }
            else {
                System.out.println("Invalid Input! Profit and loss percent must be greater than zero and less than 100 and selling price must be greater than zero.");
            }
        }
    }
}