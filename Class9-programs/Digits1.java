// A program to check the number of digits of a number.
import java.util.*;
public class Digits1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            double number = in.nextDouble();
            // Condition
            if (number >=0 && number < 10) {
                // Calculation
                double square = number * number;
                // Output
                System.out.println("A one-digit number.");
                System.out.println("The square of the number is " + square);
            }
            else if (number >= 10 && number < 100) {
                // Calculation
                double sqrt = Math.sqrt(number);
                // Output
                System.out.println("A two-digit number.");
                System.out.println("The square root of the number is " + sqrt);
            }
            else if (number >= 100 && number < 1000) {
                // Calculation
                double cbrt = Math.cbrt(number);
                // Output
                System.out.println("A three-digit number.");
                System.out.println("The cube root of the number is " + cbrt);
            }
            else {
                // Output
                System.out.println("The number entered is more than three digits.");
            }
        }
    }
}