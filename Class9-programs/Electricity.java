// A program to display the electricity bill.
import java.util.*;
public class Electricity {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the consumer's name: ");
            String name = in.nextLine();
            System.out.print("Enter the consumer's number: ");
            double number = in.nextDouble();
            in.nextLine();
            System.out.print("Enter the month: ");
            String month = in.nextLine();
            System.out.println("Enter the units consumed: ");
            double units = in.nextDouble();
            // Output
            System.out.println("Consumer's Name = " + name);
            System.out.println("Consumer's Number = " + number);
            System.out.println("Month = " + month);
            // Condition
            if (units >= 0 && units <= 100) {                
                double charges = units * 1.80;
                // Output
                System.out.println("Electricity charges = " + charges);
            }
            else if (units > 100 && units <= 300) {
                double charges = units * 2.30;
                // Output
                System.out.println("Electricity charges = " + charges);
            }
            else if (units > 300 && units <= 500) {                               
                double charges = units * 2.80;
                // Output
                System.out.println("Electricity charges  = " + charges);
            }
            else if (units > 500) {                
                double charges = units * 3.50;
                // Output
                System.out.println("Electricity charges = " + charges);
            }
            else {                
                System.out.println("Invalid Input! Units must be a non-negative number.");
            }       
        }
    }
}