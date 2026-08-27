//To calculate and display 3 rational numbers between any two natural numbers.
import java.util.*;
public class RationalNumbers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the 1st natural number: ");
            int a = in.nextInt();
            System.out.print("Enter the 2nd natural number: ");
            int b = in.nextInt();
            // Condition
            if(a < b) {
                 // Calculation
                 double c = (a + b) / 2.0;
                 double d = (c + b) / 2.0;
                 double e = (a + d) / 2.0;
                 // Output
                System.out.println("Rational numbers between " + a + " and " + b + " are: ");
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
            }
            else {
                System.out.println("INVALID INPUT! First number must be smaller than the second number.");
            }
        }
    }
}     