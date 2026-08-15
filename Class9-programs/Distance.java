// A program to calculate the amount to be paid by the passenger.
import java.util.*;
public class Distance {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the Taxi number: ");
            String number = in.nextLine();
            System.out.print("Enter the distance covered: ");
            double distance = in.nextDouble();
            // Output
            System.out.println("Taxi No. : " + number);
            System.out.println("Distance covered : " + distance);
            // Condition
            if (distance > 0) {
                if (distance <= 5) {
                    // Calculation
                    double amount = 100;
                    // Output
                    System.out.println("Amount : " + amount + "INR.");
                }
                else if (distance <= 15 && distance > 5) {
                    double a = distance - 5;
                    double amount = 100 + 10 * a ;
                    System.out.println("Amount : " + amount + "INR.");
                }
                else if (distance <= 25 && distance > 15) {
                    double a = distance - 15;
                    double amount = 200 + 8 * a; 
                    System.out.println("Amount : " + amount + "INR.");
                }
                else {
                    double a = distance - 25;
                    double amount = 280 + a * 5;
                    System.out.println("Amount : " + amount + "INR.");
                }
            }
            else {
                System.out.println("Invalid Input! Distance must be greater than zero.");
            }
        }
    }
}