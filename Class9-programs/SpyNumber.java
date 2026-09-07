// A program to check whether a number is a Spy number or not.
import java.util.*;
public class SpyNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a, sum = 0, product = 1;
            // Input a number from the user.
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            // To find the sum and product of the digits of the number.
            while(num != 0) {
                a = num % 10;
                sum = sum + a;
                product = product * a;
                num = num / 10;
            }
            // To check if the number is a spy number or not and print the result.
            if (sum == product) {
                System.out.println("The number is a Spy number.");
            }
            else {
                System.out.println("The number is not a Spy number.");
            }
        }
    }
}