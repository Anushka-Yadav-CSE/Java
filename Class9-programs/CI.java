// To calculate and display the compound interest for 3 years.
import java.util.*;
public class CI {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the principal amount: ");
            double principal = in.nextDouble();
            System.out.print("Enter the rate of compound interest: ");
            double rate = in.nextDouble();
            if ( principal > 0 && rate >= 0) {

               // Calculation
               double interest1 = (principal * rate) / 100.0;
               double amount1 = interest1 + principal;
               double interest2 = (amount1 * rate) / 100.0;
               double amount2 = interest2 + amount1;
               double interest3 = (amount2 * rate) / 100.0;
               double amount3 = interest3 + amount2;
               // Output
               System.out.println("First year: ");
               System.out.println("Interest: " + interest1);
               System.out.println("Amount: " + amount1);
               System.out.println();
               System.out.println("Second year: ");
               System.out.println("Interest: " + interest2);
               System.out.println("Amount: " + amount2);
               System.out.println();
               System.out.println("Third year: ");
               System.out.println("Interest: " + interest3);
               System.out.println("Amount: " + amount3);
            }
            else {
                System.out.println("Invalid Input! Principal must be greater than zero and rate of compound interest must be either greater than or equal to zero.");
            }
        }
    }
}