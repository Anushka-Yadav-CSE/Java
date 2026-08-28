// A program to take side of the square as input and calculate the area, perimeter and diagonal of the square.
import java.util.*;
public class Square {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the side of the square: ");
            double side=in.nextDouble();
            double area=side*side;
            double perimeter=4*side;
            double diagonal=Math.sqrt(2)*side;
            System.out.println("Area of the square = " + area);
            System.out.println("Perimeter of the square = " + perimeter);
            System.out.println("Diagonal of the square = " + diagonal);
        }
    }
}