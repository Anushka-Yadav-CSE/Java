// A program to check whether a year is a leap year or a century year.
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the year: ");
            int year = in.nextInt();
            // Condition
            if (year % 4 == 0 && year % 100 != 0) {
                // Output
                System.out.println("The year is a Leap Year"); 
            }
            else if (year % 400 == 0) {
                // Output
                System.out.println("The year is a Century Leap Year.");
            }
            else if (year % 100 == 0) {
                // Output
                System.out.println("The year is a Century Year but not a Leap Year.");
            }
            else {
                // Output
                System.out.println("The year is neither a Century Year nor a Leap Year.");
            }
        }
    }
}