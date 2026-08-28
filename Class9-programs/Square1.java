// A program to find the area and perimeter of the square.
import java.util.*;
public class Square1 {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the diagonal of the square: ");
            double diagonal=in.nextDouble();
            double side=diagonal/Math.sqrt(2);
            double perimeter=4*side;
            double area=side*side;
            System.out.println("Area of the square is " + area);
            System.out.println("Perimeter of the square is " + perimeter);
        }
    }
}