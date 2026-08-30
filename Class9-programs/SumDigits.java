// A program to display the sum of each digit of a number raised to the power of the number of the digits.
import java.util.*;
public class SumDigits {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int b; int c = 0;
            int sum = 0;
            // Prompting the user to take the number as input.
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            // Storing the value of number in a temporary variable.
            int a = num;
            // while loop to count the number of digits in the number.
            while (num != 0) {                
                c = c + 1;
                num = num / 10;
            }
            // Output to print the number of digits.        
            System.out.println("Number of digits = " + c);
            // while loop to add each digit raised to the power of the number of digits. 
            while ( a != 0) {
                b = a % 10;
                sum = sum + (int)Math.pow(b,c);
                a = a / 10;
            }
            // Output to print the sum of each digit raised to the power of the number of digits.
            System.out.println("Result = " + sum);
        }
    }
}