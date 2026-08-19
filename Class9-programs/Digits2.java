// A program to display all the digits of a number/
import java.util.*;
public class Digits2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            int n = in.nextInt();
            // Output
            System.out.println("The digits of the number: ");
            // While loop
            while (n > 0) {
                // Calculation
                int a = n % 10;
                // Output
                System.out.println(a);
                // Calculation
                n = n / 10;
            }
        }
    }
} 