// A program to check the buzz number or to find the GCD (Greatest Common Divisor).
import java.util.*;
public class BuzzGCD {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Prompting the user to choose between checking a Buzz number or finding the GCD.
            System.out.println("1. To check the Buzz number.");
            System.out.println("2. To find the GCD.");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Using a switch statement to handle the user's choice.
            switch(choice) {
                // Case 1: Check if the number is a Buzz number.
                case 1 -> {
                    System.out.print("Enter the number: ");
                    int number = in.nextInt();
                    if (number % 7 == 0 || number % 10 == 7) {
                        System.out.println("The number is a Buzz number.");
                    }
                    else {
                        System.out.println("The number is not a Buzz number.");
                    }
                }
                // Case 2: Calculate the GCD of two numbers.
                case 2 -> {
                    System.out.print("Enter the first number: ");
                    int a = in.nextInt();
                    System.out.print("Enter the second number: ");
                    int b = in.nextInt();
                    while (b != 0) {
                        int c = a % b;    
                        a = b;
                        b = c;
                    }
                    System.out.println("GCD of two numbers = " + a);
                }
                // Default case: Handle invalid choice.
                default -> {
                    System.out.println("Wrong Choice!");
                }
            }
        }
    }
}