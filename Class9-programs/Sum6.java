// A program to display the sum of 10 numbers entered by the user.
import java.util.*;
public class Sum6 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            int s = 0;
            System.out.println("Enter any 10 numbers: ");
            for (int i = 1; i <= 10; i++) {
                int j = in.nextInt();
                s = s + j;
            }
            System.out.println("Sum of the numbers = " + s);
        }
    }
}
