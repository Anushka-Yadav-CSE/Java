// A program to find and display the area and perimeter of a right angled triangle by using function argument.
import java.util.*;
public class Triangle {
    public static void calculate(double perpendicular, double base){
    double area=1.0/2.0*base*perpendicular;
    double hypotenuse=Math.sqrt((base*base)+(perpendicular*perpendicular));
    double perimeter=base+perpendicular+hypotenuse;
    System.out.println("Area of the triangle is " +area);
    System.out.println("Perimeter of the triangle is " + perimeter);
    }
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the base of the triangle: ");
            double base=in.nextDouble();
            System.out.print("Enter the perpendicular of the triangle: ");
            double perpendicular=in.nextDouble();
            calculate(perpendicular,base);
        }
    }
}