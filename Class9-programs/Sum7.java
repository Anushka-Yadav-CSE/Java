// A program to display the sum of even and odd numbers.
import java.util.*;
public class Sum7 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter integers to continue and a character to terminate: ");
            int n;
            int sum1 = 0;
            int sum2 = 0;
            while (in.hasNextInt()) {
                n = in.nextInt();
                if (n % 2 == 0) {
                    sum1= sum1 + n;
                }
                else {
                    sum2 = sum2 + n;
                }
            }
            System.out.println("The Program terminates.");
            System.out.println("Sum of even numbers = " + sum1);
            System.out.println("Sum of odd numbers = " + sum2);
        }
    }
}
