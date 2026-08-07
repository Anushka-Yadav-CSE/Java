// A program to calculate and display the radius of the circle.
import java.util.*;
public class Circle {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the area of the circle: ");
            double area = in.nextDouble();
            // Condition
            if (area > 0) {
                double radius = Math.sqrt(area / Math.PI);
                System.out.println("Area of the circle is " + area);
                System.out.println("Radius of the circle is " + radius);
            }
            else {
                System.out.println("Invalid Input! Area must be greater than zero.");
            }
        }
    }
}