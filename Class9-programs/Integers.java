// A program to accept 50 integers and display the smallest and greatest numbers.
import java.util.*;
public class Integers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            int min, max;
            System.out.println("Enter the integer numbers: ");
            int a = in.nextInt();
            min = a;
            max = a;
            for (int i = 1; i <= 49; i++) {
                int b = in.nextInt();
                min = Math.min(b, min);
                max = Math.max(b, max);
            }
            System.out.println("Smallest Number = " + min);
            System.out.println("Greatest Number = " + max);
        }
    }
}
