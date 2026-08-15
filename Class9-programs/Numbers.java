// A program to display the greatest of three numbers if they are unequal.
import java.util.*;
public class Numbers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the first number: ");
            double number1 = in.nextDouble();
            System.out.print("Enter the second number: ");
            double number2 = in.nextDouble();
            System.out.print("Enter the third number: ");
            double number3 = in.nextDouble();
            // Condition
            if (number1 != number2 && number2 != number3 && number3 != number1) {
                // Calculation
                double a = Math.max (number1,number2);
                double max = Math.max(a,number3);
                // Output
                System.out.println("The greatest among the three numbers is " + max);
            }
            else {
                // Output
                System.out.println("Invalid Input! Numbers should be unequal.");
            }
        }
    }
}