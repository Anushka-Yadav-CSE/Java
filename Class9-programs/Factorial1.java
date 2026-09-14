// A program to display the sum of the factorial of all the natural numbers from 1 to n.
import java.util.*;
public class Factorial1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int sum = 0;
            System.out.print("Enter the value of n: ");
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                int f = 1;
                for (int j = 1; j <= i; j++) {
                    f = f * j;
                }
                sum = sum + f;
            }
            System.out.println("The sum of the factorial of numbers 1 to " + n + " is" + sum);
        }
    }
}