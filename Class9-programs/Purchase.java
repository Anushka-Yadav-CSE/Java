// A program to calculate and display the net amount to paid by the customer along with his name.
import java.util.*;
public class Purchase {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the name of the customer: ");
            String name = in.nextLine();
            System.out.print("Enter the amount of purchase: ");
            double amount = in.nextDouble();
            System.out.println("Enter 1 for Laptop.");
            System.out.println("Enter 2 for Desktop PC.");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Output
            System.out.println("Name: " + name);
            // Condition
            if (amount > 0) {
                // switch case
                switch (choice) {
                    case 1 -> {
                        // Condition
                        if (amount <= 25000) {
                            // Calculation
                            double netAmount = amount;
                            // Output
                            System.out.println("Net amount = " + netAmount);
                        }
                        else if (amount <= 50000) {
                            // Calculation
                            double discount = amount * 5.0 / 100.0;
                            double netAmount = amount - discount;
                            // Output
                            System.out.println("Net amount = " + netAmount);
                        }
                        else if (amount <= 100000) {
                            // Calculation
                            double discount = amount * 7.5 / 100.0;
                            double netAmount = amount - discount;
                            // Output
                            System.out.println("Net amount = " + netAmount);
                        }
                        else {
                            // Calculation
                            double discount = amount * 10.0 / 100.0;
                            double netAmount = amount - discount;
                            // Output
                            System.out.println("Net amount = " + netAmount);
                        }
                    }
                    case 2 -> {                        
                        // Condition
                        if (amount <= 25000) {
                            // Calculation
                            double discount = amount * 5.0 / 100.0;
                            double netAmount = amount - discount;
                            // Output
                            System.out.println("Net amount = " + netAmount);
                        }
                        else if (amount <= 50000) {
                            // Calculation
                            double discount = amount * 7.5 / 100.0;
                            double netAmount = amount - discount;
                            // Output
                            System.out.println("Net amount = " + netAmount);
                        }
                        else if (amount <= 100000) {
                            // Calculation
                            double discount = amount * 10.0 / 100.0;
                            double netAmount = amount - discount;
                            // Output
                            System.out.println("Net amount = " + netAmount);
                        }
                        else {
                            // Calculation
                            double discount = amount * 15.0 / 100.0;
                            double netAmount = amount - discount;
                            // Output
                            System.out.println("Net amount = " + netAmount);
                        }
                    }
                    default -> {
                        // Output
                        System.out.println("Wrong Choice!");
                    }
                }
            }
            else {                
                // Output
                System.out.println("Invalid Input! Amount must be greater than zero.");
            }
        }
    }
}             