// A program to display the name of the shop and total amount.
import java.util.*;
public class Floor {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.println("Enter 1 for Ground Floor: Kids Wear..");
            System.out.println("Enter 2 for First Floor: Ladies Wear..");
            System.out.println("Enter 3 for Second Floor: Designer Sarees..");
            System.out.println("Enter 4 for Third Floor: Men's Wear..");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Output
            System.out.println("Name of the Shop: City Mart");
            // Switch Case
            switch(choice) {
                case 1 -> {
                    // Input
                    System.out.print("Enter the total amount: ");
                    double amount = in.nextDouble();
                    // Condition
                    if (amount > 0) {
                        // Output
                        System.out.println("Total Amount = " + amount);
                        System.out.println("Visit Again!!!");
                    }
                    else {
                        // Output
                        System.out.println("Invalid Input! Amount must be greater than zero.");
                    }
                }
                case 2 -> {
                    // Input
                    System.out.print("Enter the total amount: ");                     
                    double amount = in.nextDouble();
                     // Condition
                    if (amount > 0) {
                        // Output
                        System.out.println("Total Amount = " + amount);
                        System.out.println("Visit Again!!!");
                    }
                    else {
                        // Output
                        System.out.println("Invalid Input! Amount must be greater than zero.");
                    }
                }
                case 3 -> {
                    // Input
                    System.out.print("Enter the total amount: ");                     
                    double amount = in.nextDouble();
                     // Condition
                    if (amount > 0) {
                        // Output
                        System.out.println("Total Amount = " + amount);
                        System.out.println("Visit Again!!!");
                    }
                    else {
                        // Output
                        System.out.println("Invalid Input! Amount must be greater than zero.");
                    }
                }
                case 4 -> {
                    // Input
                    System.out.print("Enter the total amount: ");
                    double amount = in.nextDouble();
                     // Condition
                    if (amount > 0) {
                        // Output
                        System.out.println("Total Amount = " + amount);
                        System.out.println("Visit Again!!!");
                    }
                    else {
                        // Output
                        System.out.println("Invalid Input! Amount must be greater than zero.");
                    }
                }
                default -> {
                    // Output
                    System.out.println("Wrong Choice!");
                }
            }  
        }
    }
}