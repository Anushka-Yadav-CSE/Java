// A program to find and display all of the quadrilateral's angles.
import java.util.*;
public class Quadrilateral {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the 1st angle's ratio: ");
            int a=in.nextInt();
            System.out.print("Enter the 2nd angle's ratio: ");
            int b=in.nextInt();
            System.out.print("Enter the 3rd angle's ratio: ");
            int c=in.nextInt();
            System.out.print("Enter the 4th angle's ratio: ");
            int d=in.nextInt();
            double sum=a+b+c+d;
            double value=360/sum;
            System.out.println("1st angle is " + (a*value));
            System.out.println("2nd angle is " + (b*value));
            System.out.println("3rd angle is " + (c*value));
            System.out.println("4th angle is " + (d*value));
        }
    }
}