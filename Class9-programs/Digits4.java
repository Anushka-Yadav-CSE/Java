// A program to input a number and display the sum of its digits.
import java.util.*;
public class Digits4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            int a = in.nextInt();
            int s = 0;
            // while loop
            while( a > 0) {
                // Calculation
                int b = a % 10;
                s = s + b;
                a = a / 10;
            }
            // Output
            System.out.println("The sum of the digits is " + s);
        }
    }
}