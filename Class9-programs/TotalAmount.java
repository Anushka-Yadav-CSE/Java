// To calculate and display the amount to be paid by the customer.
import java.util.*;
public class TotalAmount {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the printed price: ");
            double printedPrice = in.nextDouble();
            System.out.print("Enter the discount (%) given by the shopkeeper: ");
            double percentDiscount = in.nextDouble();
            System.out.print("Enter the GST (%): ");
            double percentGst = in.nextDouble();
            // Calculation
            double discount = printedPrice * percentDiscount / 100.0; 
            double gst = (printedPrice - discount) * percentGst / 100.0;
            double amount = (printedPrice - discount) + gst;
            // Output
            System.out.println("Printed price: " + printedPrice);
            System.out.println("Discount: " + discount);
            System.out.println("GST: " + gst);
            System.out.println("Total amount paid by the customer: " + amount);
        }
    }
}