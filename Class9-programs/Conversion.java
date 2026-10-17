//A program to detect numeric input and display it as an integer or a decimal number.
import java.util.*;
public class Conversion {
    public static void main(String[] args) {
        try (Scanner in =new Scanner(System.in)) {
            System.out.println("Enter your data: ");
            if (in.hasNextInt()) {
                int num = in.nextInt();
                System.out.println("The data expressed in integer = " + num);
            }
            else if (in.hasNextDouble()) {
                double num = in.nextDouble();
                System.out.println("The data expressed in decimal = " + num);
            }
            else {
                System.out.println("Token is not an integer or a real value.");
            }    
        }
    }
}
