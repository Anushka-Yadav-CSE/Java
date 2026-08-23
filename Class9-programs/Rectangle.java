// A program to find and display the area, perimeter or diagonal of a rectangle.
import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the length of the rectangle: ");
            double length = in.nextDouble();
            System.out.print("Enter the breadth of the rectangle: ");
            double breadth = in.nextDouble();
            System.out.println("Enter 1 for area, 2 for perimeter and 3 for diagonal.");
            System.out.print("Enter your choice: ");
            int n = in.nextInt();
            // Switch case
            switch (n)
            {
                case 1:
                    // Calculation
                    double area = length * breadth;
                    // Output
                    System.out.println("Length of the rectangle is " + length);
                    System.out.println("Breadth of the rectangle is " + breadth);
                    System.out.println("Area of the rectangle is " + area);
                    break;                        
                case 2:
                    // Calculation
                    double perimeter = 2 * (length + breadth);
                    // Output                       
                    System.out.println("Length of the rectangle is " + length);
                    System.out.println("Breadth of the rectangle is " + breadth);
                    System.out.println("Perimeter of the rectangle is " + perimeter);
                    break;
                case 3:
                    // Calculation
                    double diagonal = Math.sqrt(length * length + breadth * breadth);
                    // Output
                    System.out.println("Length of the rectangle is " + length);
                    System.out.println("Breadth of the rectangle is " + breadth);
                    System.out.println("Diagonal of the rectangle is " + diagonal);
                    break;
                default:
                    // Output
                    System.out.println("Wrong choice!");
            }
        }
    }
}