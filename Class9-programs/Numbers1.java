// A menu driven program to input two positive numbers and perform some calculations as per the user's choice.
import java.util.*;
public class Numbers1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input two numbers from the user.
            System.out.print("Enter the first number: ");
            int m = in.nextInt();
            System.out.print("Enter the second number: ");
            int n = in.nextInt();
            System.out.println("1: To do addition without using the + operator. ");
            System.out.println("2: To do subtraction without using the - operator.");
            System.out.println("3: To do division without using the / or % operator.");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            int sum = m;
            int diff = m;
            // Check if the numbers are positive and m is greater than n.
            if (m > 0 && n > 0 && m > n) {
                // Perform the operation based on the user's choice.
                switch(choice) {
                    // Perform addition without using the + operator.
                    case 1 -> {                        
                        for (int i = 1; i <= n; i++ ) {                            
                            sum ++;
                        }                        
                        System.out.println("The sum = " + sum);
                    }
                    case 2 -> {
                        // Perform subtraction without using the - operator.
                        for (int i = 1; i <= n; i++) {
                            diff --;
                        }
                        System.out.println("The difference = " + diff);
                    }
                    case 3 -> {
                        // Perform division without using the / or % operator.
                        int tempM = m;
                        int quotient = 0;
                        while (tempM >= n) {
                            tempM = tempM - n;
                            quotient ++;
                        }
                        int rem = tempM;
                        System.out.println("Remainder = " + rem);
                        System.out.println("Quotient = " + quotient);
                    }
                    // Handle invalid input choice.
                    default -> {
                        System.out.println("Invalid Input! Please choose between 1 and 3...");
                    }
                }
            }
            // Handle invalid input for numbers.
            else {
                System.out.println("Invalid Input! Numbers must be positive and the first number must be greater than the second number.");
            }
        }
    }
}