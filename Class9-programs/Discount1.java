// A program to calculate and display discount and the net amount.
import java.util.*;
public class Discount1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter name of the customer: ");
            String name = in.nextLine();
            System.out.print("Enter the amount of purchase: ");
            double amount = in.nextDouble();
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Output
            System.out.println("Name: " + name);
            System.out.println("Amount: " + amount);
            // Condition
            if (choice == 1) {
                if (amount <= 20000) {
                    // Calculation
                    double discount = amount * 5 / 100.0;
                    double discountedPrice = amount - discount;
                    double tax = discountedPrice * 12.5 / 100.0;
                    double netAmount = discountedPrice + tax;
                    // Output
                    System.out.println("Total amount after discount = " + discountedPrice);
                    System.out.println("Net amount to be paid by the customer = " + netAmount);
                }
                else if (amount >= 20001 && amount <= 40000) {
                    // Calculation
                    double discount = amount * 7.5 / 100.0;
                    double discountedPrice = amount - discount;
                    double tax = discountedPrice * 12.5 / 100.0;
                    double netAmount = discountedPrice + tax;
                    // Output
                    System.out.println("Total amount after discount = " + discountedPrice);
                    System.out.println("Net amount to be paid by the customer = " + netAmount);
                }
                else if (amount >= 40001 && amount <= 60000) {
                    // Calculation
                    double discount = amount * 10 / 100.0;
                    double discountedPrice = amount - discount;
                    double tax = discountedPrice * 12.5 / 100.0;
                    double netAmount = discountedPrice + tax;
                    // Output 
                    System.out.println("Total amount after discount = " + discountedPrice);
                    System.out.println("Net amount to be paid by the customer = " + netAmount);
                }
                else if (amount > 60000) {
                    // Calculation
                    double discount = amount * 12 / 100.0;
                    double discountedPrice = amount - discount;
                    double tax = discountedPrice * 12.5 / 100.0; 
                    double netAmount = discountedPrice + tax;
                    // Output
                    System.out.println("Total amount after discount = " + discountedPrice);
                    System.out.println("Net amount to be paid by the customer = " + netAmount);
                }
            }
            else if (choice == 2) {                                
                if (amount <= 20000) {
                    // Calculation
                    double discount = amount * 2.5 / 100.0;
                    double discountedPrice = amount - discount;
                    double tax = discountedPrice * 12.5 / 100.0;
                    double netAmount = discountedPrice + tax;
                    // Output 
                    System.out.println("Total amount after discount = " + discountedPrice);
                    System.out.println("Net amount to be paid by the customer = " + netAmount);
                }
                else if (amount >= 20001 && amount <= 40000) {
                    // Calculation
                    double discount = amount * 5 / 100.0;
                    double discountedPrice = amount - discount;
                    double tax = discountedPrice * 12.5 / 100.0; 
                    double netAmount = discountedPrice + tax;
                    // Output
                    System.out.println("Total amount after discount = " + discountedPrice);
                    System.out.println("Net amount to be paid by the customer = " + netAmount);
                }
                else if (amount >= 40001 && amount <= 60000) {
                    // Calculation
                    double discount = amount * 7 / 100.0;
                    double discountedPrice = amount - discount;
                    double tax = discountedPrice * 12.5 / 100.0;
                    double netAmount = discountedPrice + tax; 
                    // Output
                    System.out.println("Total amount after discount = " + discountedPrice);
                    System.out.println("Net amount to be paid by the customer = " + netAmount);
                }
                else if (amount > 60000) {
                    // Calculation
                    double discount = amount * 8.5 / 100.0;
                    double discountedPrice = amount - discount;
                    double tax = discountedPrice * 12.5 / 100.0;
                    double netAmount = discountedPrice + tax;
                    // Output 
                    System.out.println("Total amount after discount = " + discountedPrice);
                    System.out.println("Net amount to be paid by the customer = " + netAmount);
                }
            }
            else {
                // Output
                System.out.println("Invalid Input! The choice must be either 1 or 2.");
            }
        }
    }
}