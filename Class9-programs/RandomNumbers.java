// A program to generate and display a user-specified number of random decimal values from 1 (inclusive) to N (exclusive).
import java.util.*;
public class RandomNumbers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            System.out.print("Enter the value of N: ");
            int n = in.nextInt();
            if ( n > 1) {
                System.out.println("Enter the number of random numbers(a) you want to print: ");
                int a = in.nextInt();
                if (a >= 1) {
                    System.out.println("Random Numbers between 1 and " + n + " are:");
                    for (int i = 1; i <= a; i++) {
                        double r = (Math.random() * (n - 1)) + 1;
                        System.out.println(r);
                    }
                }
                else {
                    System.out.println("Invalid Input! a must be equal to or greater than 1. ");
                }
            }
            else {
                System.out.println("Invalid Input! N must be greater than 1.");
            }
        }
    }
} 
