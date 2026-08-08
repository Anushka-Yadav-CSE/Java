// A program to calculate and display the side of a cube taking volume as input.
import java.util.*;
public class Cube {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the volume of the cube: ");
            double volume = in.nextDouble();
            // Condition
            if (volume > 0) {
                // Calculation
                double side = Math.cbrt(volume);
                // Output
                System.out.println("The volume of the cube is: " + volume);
                System.out.println("The side of the cube is " + side);
            }
            else {
                System.out.println("Invalid Input! Volume must be greater than zero.");
            }
        }
    }
}