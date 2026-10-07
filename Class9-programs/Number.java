// A program to input a number and display its digits raised to the power of their
// respective positions.
import java.util.*;
public class Number {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = 0, a, b, c;
            // Taking input from the user.
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            a = num;
            // Extracting the digits and calculation their position.
            while(a != 0) {
                c = 1;
                b = a % 10;
                n++;
                // Loop to display the extracted digit raised to their positions.
                for (int i = 1; i <= n; i++) {
                    c = b * c;
                }
                System.out.println(c);
                a = a / 10;
            }
            System.out.println( " " );
        }
    }
}