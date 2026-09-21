// A program to display the factorial of a number.
import java.util.*;
public class Factorial2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = 1;
            // Prompt the user to enter the number.
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            // Condition to check whether the number is greater than, less than or equal to 0 and display accordingly.
            if (num == 0) {
                int b = 1;
                System.out.println("Factorial of " + num + " is " + b);
            }
            else if (num < 0) {
                System.out.println("Invalid Input! Number must be greater than  or equal to 0.");
            }
            else {
                // Looping to calculate the factorial.
                for (int i = num; i >= 1; i--) {
                    a = a * i;
                }
            // Printing the result.
            System.out.println("Factorial of " + num + " is " + a);
            }
        }
    }
}