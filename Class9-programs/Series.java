// A program to display the sum of the series:- s = 1/2 + 1/4 + 1/8 + 1/16 + ... upto n terms.
import java.util.*;
public class Series {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the value of n: ");            
            double n = in.nextDouble();
            double s = 0;
            // for loop
            for (int i = 1; i <= n; i++) {
                s = s + 1.0 / Math.pow(2,i);
            }
            System.out.println("s = " + s);
        }
    }
}