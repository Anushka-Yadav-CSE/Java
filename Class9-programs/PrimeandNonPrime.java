// A program to display all the prime and non-prime numbers from 1 to 100 as per the user's choice.
import java.util.*;
public class PrimeandNonPrime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("1: To display all the Prime numbers from 1 to 100");
            System.out.println("2: To display all the Non-Prime numbers from 1 to 100");
            // Prompt the user to enter their choice.
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Switch case to display as per the user's choice.
            switch (choice) {
                // To display prime numbers from 1 to 100.
                case 1 -> {
                    System.out.println("Prime numbers from 1 to 100 are: ");
                    for (int i = 1; i <= 100; i++) {
                        int k = 0;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0) {
                                k = k + 1;
                            }
                        }
                        if (k == 2) {                            
                            System.out.println(i);
                        }
                    }
                }
                // To display non-prime numbers from 1 to 100. 
                case 2 -> {
                    System.out.println("Non-Prime numbers from 1 to 100 are: ");
                    for (int i = 1; i <= 100; i++) {
                        int k = 0;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0) {
                                k = k + 1;
                            }
                        }
                        if (k > 2) {
                            System.out.println(i);
                        }
                    }
                }
                // Handles invalid choice.
                default -> {
                    System.out.println("Invalid Choice!!");
                }
            }
        }
    }
}