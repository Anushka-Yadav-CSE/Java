// A program to check for a palindrome number.
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            int b, c = 0;
            System.out.print("Enter the number: ");
            int a = in.nextInt();
            int d = a;
            // do while loop
            do {
                // Calculation
                b = a % 10;
                c = c * 10 + b;
                a = a / 10;
            }
            while (a != 0);
            // Condition
            if (c == d) {
                // Output
                System.out.println("The number is a palindrome number.");
            }
            else {
                // Output
                System.out.println("The number is not a palindrome number.");
            }
        }
    }
}