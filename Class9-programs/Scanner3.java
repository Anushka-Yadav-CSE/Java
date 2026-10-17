// A program to test different type of data.
import java.util.*;
public class Scanner3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your data: ");
            if (in.hasNextInt()) {
                int num = in.nextInt();
                System.out.println("The " + num + " is an integer.");
            }
            else if (in.hasNextDouble()) {
                double num = in.nextDouble();
                System.out.println("The " + num + " is a decimal number.");
            }
            else {
                System.out.println("Token is not an integer or a real value.");
            }
        }
    }
}
