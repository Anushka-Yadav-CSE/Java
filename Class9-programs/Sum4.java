// A program to display the sum of positive even numbers and negative odd numbers.
import java.util.*;
public class Sum4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double sum = 0; double sum1 = 0;
            // while loop to take input from the user until 0 is entered.
            while (true) {
                // Input from the user.
                System.out.print("Enter a number: ");
                int a = in.nextInt();
                // Condition to check whether the number is 0. If the number is 0, the loop will break and the program will terminate.
                if (a == 0) {
                    break;
                }
                // Condition to check whether the number is positive even number and if it is true, then the number will be added to sum.
                if (a > 0 && a % 2 == 0) {
                    sum = sum + a;
                }
                // Condition to check whether the number is negative odd number and if it is true, then the number will be added to sum1.
                if (a < 0 && a % 2 != 0) {
                    sum1 = sum1 + a;
                }
            }
            // Output the sum of positive even numbers and negative odd numbers and terminates the program.
            System.out.println("Sum of positive even numbers = " + sum);
            System.out.println("Sum of negative odd numbers = " + sum1);
            System.out.println("Program Terminates!");
        }
    }
}