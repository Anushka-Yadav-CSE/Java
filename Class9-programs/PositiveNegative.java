/* A program to input 10 numbers and count and display the positive numbers and negative
 numbers and their sum individually. */
import java.util.*;
public class PositiveNegative {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Initialising the variables to count and sum the positive and negative numbers.
            int countp = 0; int sump = 0;
            int countn = 0; int sumn = 0;
            // for loop to iterate 10 times to input the numbers.
            for (int i = 0; i < 10; i++) {                
                System.out.println("Enter the numbers: ");
                int num = in.nextInt();
                // Condition to check whether the number is positive, negative or zero and count and sum accordingly.
                if (num > 0) {
                    countp = countp + 1;
                    sump = sump + num;                
                }
                else if (num < 0) {
                countn = countn + 1;
                sumn = sumn + num;
                }
                else {
                    System.out.println("The number is neither a positive nor a negative number.");
                }
            }
            System.out.println("Number of positive numbers are " + countp);
            System.out.println("Sum of positive numbers = " + sump);
            System.out.println("Number of negative numbers are " + countn);
            System.out.println("Sum of negative numbers = " + sumn);
        }
    }
}