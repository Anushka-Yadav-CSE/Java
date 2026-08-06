// To compare discounts given by 2 shopkeepers and display who gives more discount.
import java.util.*;
public class ComparingDiscounts {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the price of the article: ");
            double price = in.nextDouble();
            System.out.print("Enter the discount (%) given by shopkeeper 1: ");
            double percentDiscount1 = in.nextDouble();
            System.out.print("Enter the discount (%) given by shopkeeper 2: ");
            double percentDiscount2 = in.nextDouble();
            System.out.print("Enter the successive discount (%) given by shopkeeper 2: ");
            double percentDiscount3 = in.nextDouble();
            // Calculation
            double discount1 = price * percentDiscount1 / 100.0;
            double discount2 = price * percentDiscount2 / 100.0;
            double discount3 = (price - discount2) * percentDiscount3 / 100.0;
            double totalAmount1 = price - discount1;
            double totalAmount2 = price - discount2 - discount3;
            // Condition
            if (totalAmount1 < totalAmount2) {
                double totalAmount = totalAmount2 - totalAmount1;
                System.out.println("Shopkeeper 1 gives a higher discount and by " + totalAmount + " INR.");
            }
            else if (totalAmount1 > totalAmount2) {
                double totalAmount = totalAmount1 - totalAmount2;
                System.out.println("Shopkeeper 2 gives a higher discount and by " + totalAmount + " INR.");
            }
            else {
                System.out.println("Both shopkeepers offer the same discount.");
            }
        }
    }
}