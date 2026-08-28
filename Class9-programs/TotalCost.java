// A program to calculate and display the amount to be paid by the customer along with the gift.
import java.util.*;
public class TotalCost {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the total cost: ");
            double totalCost = in.nextDouble();
            // Condition
            if (totalCost > 0) {
                if (totalCost <= 2000) {
                    // Calculation
                    double discount = totalCost * 5 / 100.0;
                    double netAmount = totalCost - discount;
                    // Output
                    System.out.println("Total amount = " + netAmount);
                    System.out.println("Gift: Calculator ");
                }            
                else if (totalCost > 2000 && totalCost <= 5000) {  
                    // Calculation              
                    double discount = totalCost * 10 / 100.0;
                    double netAmount = totalCost - discount;
                    // Output
                    System.out.println("Total amount = " + netAmount);
                    System.out.println("Gift: School Bag ");
                }
                else if (totalCost > 5000 && totalCost <= 10000) {                    
                    // Calculation
                    double discount = totalCost * 15 / 100.0;
                    double netAmount = totalCost - discount;
                    // Output
                    System.out.println("Total amount = " + netAmount);
                    System.out.println("Gift: Wall Clock ");
                }
                else {                    
                    // Calculation
                    double discount = totalCost * 20 / 100.0;
                    double netAmount = totalCost - discount;
                    // Output
                    System.out.println("Total amount = " + netAmount);
                    System.out.println("Gift: Wrist Watch ");
                }
            }
            else {
                // Output
                System.out.println("Invalid Input! Total cost must be greater than zero.");
            }
        }
    }
}