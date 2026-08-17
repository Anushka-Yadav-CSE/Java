// A program to display the type of triangle.
import java.util.*;
public class Triangle2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the sides of the triangle: ");
            double a = in.nextDouble(); 
            double b = in.nextDouble(); 
            double c = in.nextDouble(); 
            // Condition
            if (a > 0 && b > 0 && c > 0 &&  a + b > c && b + c > a && c + a > b) {
                if ( (a == b) && (b == c)) {
                    // Output
                    System.out.println("The triangle is an equilateral triangle.");
                }
                else if ( (a == b) || (a == c) || (b == c)) {
                    // Output
                    System.out.println("The triangle is an isosceles triangle.");
                }
                else {
                    // Output
                    System.out.println("The triangle is a scalene triangle."); 
                }
            }
            else {
                // Output
                System.out.println("Triangle is not possible.");
            }
        }
    }
}