// A program to calculate the G.C.D of two numbers.
import java.util.*;
public class GCD {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int c;
            System.out.println("Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if (num2 != 0) {
                while (num1 % num2 != 0) {
                    c = num1 % num2;
                    num1 = num2;
                    num2 = c;
                }
                System.out.println("G.C.D of the numbers = " + num2);
            }
            else {
                System.out.println("The second number must not be zero.");
            }
        }
    }
}
