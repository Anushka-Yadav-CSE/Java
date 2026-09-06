// A program to check whether a number is automorphic or not.
import java.util.*;
public class Automorphic {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input a number from user
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            int count = 0;
            int c, k = 0;
            int b, d;
            int a = num;
            int sq = num * num;
            // Count the number of digits in the number.
            while (num != 0) {
                count ++;
                num = num / 10;
            }
            d = count;
            // Check whether the number is automorphic or not.
            while (count != 0) {
                b = a % 10;
                c = sq % 10;
                a = a / 10;
                sq = sq / 10;
                count -- ;
                // Compare the last digit of the number and its square.
                if (c == b) {
                    k ++;
                }
                else {
                    break;
                }
            }
            // Print the result.
            if (k == d) {
                System.out.println("The number is an Automorphic number.");
            }
            else {
                System.out.println("The number is not an Automorphic number.");
            }
        }
    }
}