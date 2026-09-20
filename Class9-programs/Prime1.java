// To accept any 20 numbers and check whether a number is prime or not and display the same.
import java.util.*;
public class Prime1 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter 20 numbers.
            for (int i = 1; i <= 20; i++) {
                System.out.println("Enter the number: ");
                int n = in.nextInt();
                int k = 0;
                // for loop to check the number of divisors of n.
                for (int j = 1; j <= n; j++) {
                    // Condition to check whether j is a divisor of n or not.
                    if (n % j == 0) {
                        k = k + 1;
                    }
                }
                // Condition to print the prime and non-prime numbers.
                if (k == 2) {
                    System.out.println(n + " is a prime number.");
                }
                else {
                    System.out.println(n + " is not a prime number.");
                }
            }
        }
    }
}