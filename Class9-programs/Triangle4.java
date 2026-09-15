// A program to display the pattern as per the user's choice.
import java.util.*;
public class Triangle4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter 1 for a triangle pattern.");
            System.out.println("Enter 2 for a inverted triangle pattern.");
            System.out.println("Enter your choice: ");
            int choice = in.nextInt();
            // switch case.
            switch(choice) {
                case 1 -> {
                    System.out.print("Enter the number of terms: ");
                    int n = in.nextInt();
                    System.out.println("The Pattern is: ");
                    for(int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.print("Enter the number of terms: ");
                    int n = in.nextInt();
                    System.out.println("The Pattern is: ");
                    for(int i = n; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();                
                    }
                }
                default -> {
                    System.out.println("Invalid Choice!!");
                }
            }
        }
    }
}