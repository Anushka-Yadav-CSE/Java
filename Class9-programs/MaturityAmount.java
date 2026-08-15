// A program to calculate and display the maturity amount.
import java.util.*;
public class MaturityAmount {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the sum: ");
            double sum = in.nextDouble();
            System.out.print("Enter the number of days: ");
            int days = in.nextInt();
            // Condition
            if (sum > 0 && days > 0) {
                if (days <= 180) {                
                    double interest = (sum * 5.5 * days) / (100 * 365);
                    double maturity = interest + sum;
                    System.out.println("Maturity Amount: " + maturity);
                }
                else if (days >= 181 && days <= 364) {
                    double interest = (sum * 7.5 * days) / (100 * 365);
                    double maturity = interest + sum;
                    System.out.println("Maturity Amount: " + maturity);
                }
                else if (days == 365) {
                    double interest = (sum * 9.0 * days) / (100 * 365);
                    double maturity = interest + sum;
                    System.out.println("Maturity Amount: " + maturity);
                }
                else {
                    double interest = (sum * 8.5 * days) / (100 * 365);
                    double maturity = interest + sum;
                    System.out.println("Maturity Amount: " + maturity);
                }
            }
            else {
                System.out.println("Invalid Input! Sum and days must be greater than zero.");
            }
        }
    }
}