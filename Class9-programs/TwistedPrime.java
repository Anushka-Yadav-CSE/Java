// A program to check whether a number is twisted prime or not.
import java.util.*;
public class TwistedPrime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int k = 0, a, b, rem = 0, l = 0;
            // Taking input from the user.
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            // Condition to check whether number is greater than 1 or not.
            if (num > 1) {
                // Loops and conditions to check whether the number is a prime number or not.
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        k++;
                    }
                }
                if (k == 2) {
                    System.out.println("The number is a Prime Number.");
                }
                else {
                    System.out.println("The number is not a Prime Number.");
                }
                // Condition to find the reverse of the number and display if its twisted prime or not.
                if (k == 2) {
                    a = num;
                    while (a != 0) {
                        b = a % 10;
                        rem = rem * 10 + b;
                        a = a / 10;
                    }
                    for (int j = 1; j <= rem; j++) {
                        if (rem % j == 0) {
                            l++;
                        }
                    }
                    if (l == 2) {
                        System.out.println("Its reverse is also a Prime Number.");
                        System.out.println("The number is a Twisted Prime Number.");
                    }
                    else {
                        System.out.println("Its reverse is not a Prime Number.");
                        System.out.println("The number is not a Twisted Prime Number.");
                    }
                }
            }
            else {
                System.out.println("The number is not a Prime Number.");
            }
        }
    }
}