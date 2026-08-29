// A program to display the first ten odd numbers from a given number.
import java.util.*;
public class OddNumbers1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int c = 0;
            // Prompting the user to enter a number.
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            // Output to display the first ten odd numbers from the given number.
            System.out.println("First ten odd numbers from "  + num + " are: ");
            //do-while loop to check whether the number is odd or not and display the first 10 odd numbers from the given number.
            do {
                // Condition to check whether the number is odd or not.
                if (num % 2 != 0) {
                    // Output to display the odd number.
                    System.out.print(num + " ");
                    // Incrementing the number and counter to check for the next odd number.
                    c++;
                    num++;
                }
                else {
                    // Incrementing the number to check for the next odd number.
                    num++;
                }
            }
            // Condition to check whether the counter is less than 10.
            while(c < 10);
        }
    }
}