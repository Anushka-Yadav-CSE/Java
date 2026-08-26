// A program to find and display the second smallest number.
import java.util.*;
public class SecondSmallest {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the numbers: ");
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();

            // Condition
            if (a > b && a > c) {
                if (b > c) {
                    // Output
                    System.out.println("The second smallest number is " + b);
                }
                else {
                    // Output
                    System.out.println("The second smallest number is " + c);
                }
            }
            else if (b > a && b > c) {
                if (a > c) {
                    // Output
                    System.out.println("The second smallest number is " + a);
                }
                else {
                    // Output
                    System.out.println("The second smallest number is " + c);
                }
            }
            else if(c > a && c > b) {
                if (a > b) { 
                    // Output                   
                    System.out.println("The second smallest number is " + a);
                }
                else {     
                    // Output               
                    System.out.println("The second smallest number is " + b);
                }
            }
            else {
                // Output
                System.out.println("INVALID INPUT! Numbers must be unequal.");
            }
        }
    }
}