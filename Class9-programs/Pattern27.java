// A program to print the pattern by user's choice.
import java.util.*;
public class Pattern27 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            System.out.println("1: To print Triangle Pattern.");
            System.out.println("2: To print Inverted Triangle pattern.");
            System.out.println("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                // The Pattern is:
                // *
                // * *
                // * * *
                // * * * *
                // * * * * *
                case 1 -> {
                    System.out.println("The Pattern is:");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                // The Pattern is:
                // * * * * *
                // * * * *
                // * * *
                // * *
                // *
                case 2 -> {
                    System.out.println("The Pattern is:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                default -> {
                    System.out.println("Invalid choice!");
                }
            }
        }
    }
}
