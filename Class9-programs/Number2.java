// A program to display three succeeding positive even numbers or three preceding negative odd numbers.
import java.util.*;
public class Number2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            double number = in.nextDouble();
            // Condition
            if (number > 0 && number % 2 == 0) {
                System.out.println("Three succeeding positive even numbers are: ");
                // Calculation
                for (int i = 0; i < 3; i++) {
                    number = number + 2;
                    // Output
                    System.out.println(number);
                }
            }
            else if ( number < 0 && number % 2 != 0) {
                // Output
                System.out.println("Three preceding negative odd numbers are: ");
                // Calculation
                for (int i = 0; i < 3; i++) {
                    number = number - 2;
                    // Output
                    System.out.println(number);
                }
            }                    
            else { 
            // Output
            System.out.println("The number is neither a positive even nor a negative odd.");
            }
        }
    }
}