// A program to display the numbers after swapping them by using a 3rd variable.
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the 1st variable: ");
            double a=in.nextDouble();
            System.out.print("Enter the 2nd variable: ");
            double b=in.nextDouble();
            double c=a;
            a=b;
            b=c;
            System.out.println("The 1st variable(after swapping) is " + a);
            System.out.println("The 2nd variable(after swapping) is " + b);
        }
    }
}