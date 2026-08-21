// A program to check whether a number is positive or negative and terminates when number is 0.
import java.util.*;
public class Number3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // do-while loop
            do {
                // Input
                System.out.print("Enter the number: ");
                double n = in.nextDouble();
                // Condition
                if (n == 0) {
                    break;
                }
                if (n > 0) {
                    // Output
                    System.out.println("The number is a positive number..");
                }
                else {
                    // Output
                    System.out.println("The number is a negative number..");
                }
            }
            while (true);
            // Output
            System.out.println("Program Terminates!!");
        }
    }
}