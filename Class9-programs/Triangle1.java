// A program to calculate the hypotenuse of a right angled triangle.
import java.util.*;
public class Triangle1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the base: ");
            double base = in.nextDouble();
            System.out.print("Enter the perpendicular: ");
            double perpendicular = in.nextDouble();
            // Condition
            if (base > 0 && perpendicular > 0) {
                // Calculation
                double hypotenuse = Math.sqrt(base * base + perpendicular * perpendicular);
                // Output
                System.out.println("In the right-angled triangle: ");
                System.out.println("Base = " + base);
                System.out.println("Perpendicular = " + perpendicular);
                System.out.println("Hypotenuse = " + hypotenuse);
            }
            else {
                System.out.println("Invalid Input! Base and perpendicular must be greater than zero.");
            }
        }
    }
}