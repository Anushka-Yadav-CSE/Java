// A program to find the volume of solids as per the user's choice.
import java.util.*;
public class Volume {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.println("Enter 1 to find volume of cuboid.");
            System.out.println("Enter 2 to find volume of cylinder.");
            System.out.println("Enter 3 to find volume of cone.");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Switch case
            switch(choice) {
                case 1 -> {
                    // Input
                    System.out.print("Enter the length of the cuboid: ");
                    double length = in.nextDouble();
                    System.out.print("Enter the breadth of the cuboid: ");
                    double breadth = in.nextDouble();
                    System.out.print("Enter the height of the cuboid: ");
                    double height = in.nextDouble();
                    // Condition
                    if (length > 0 && breadth > 0 && height > 0) {
                        // Calculation
                        double volume = length * breadth * height;
                        // Output
                        System.out.println("Volume of the cuboid = " + volume);
                    }
                    else {
                        // Output
                        System.out.println("Invalid Input! Length, breadth and height must be greater than zero.");
                    }
                }
                case 2 -> {
                    // Input
                    System.out.print("Enter the radius of the cylinder: ");
                    double radius = in.nextDouble();
                    System.out.print("Enter the height of the cylinder: ");
                    double height = in.nextDouble();
                    // Condition
                    if (radius > 0 && height > 0) {
                        // Calculation
                        double volume = Math.PI * radius * radius * height;
                        // Output
                        System.out.println("Volume of the cylinder = " + volume);
                    }
                    else {
                        // Output
                        System.out.println("Invalid Input! Radius and height must be greater than zero.");
                    }
                }
                case 3 -> {
                    // Input
                    System.out.print("Enter the radius of the cone: ");
                    double radius = in.nextDouble();
                    System.out.print("Enter the height of the cone: ");
                    double height = in.nextDouble();
                    // Condition
                    if (radius > 0 && height > 0) {    
                        // Calculation                    
                        double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;
                        // Output
                        System.out.println("Volume of the cone = " + volume);
                    }
                    else {
                        // Output
                        System.out.println("Invalid Input! Radius and height must be greater than zero.");
                    }
                }
                default -> {
                    // Output
                    System.out.println("Wrong Choice.");
                }
            }
        }
    }
}