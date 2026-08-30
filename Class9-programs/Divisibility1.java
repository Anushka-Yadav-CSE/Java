// A program to input 20 different numbers and check whether they are divisible by 3 as well as 5.
import java.util.*;
public class Divisibility1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int sum = 0;
            // for loop to enter 20 numbers from the user.
            for (int i = 0; i < 20; i++) {
                System.out.println("Enter the numbers: ");
                int num = in.nextInt();
                // Condition to check if the number is divisible by both 3 as well as 5.
                if (num % 3 == 0 && num % 5 == 0) {
                    // Calculation to display the sum of those numbers who satisfy the condition.
                    sum = sum + num;
                }
            }
            // Output to display the sum.
            System.out.println("Sum of the numbers are: " + sum);
        }
    }
}