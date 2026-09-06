// A program to check whether a number is Automorphic or not.
import java.util.*;
public class Automorphic1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input a number from the user.
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            int sq = num * num;
            boolean isAutomorphic = true;
            // Check whether the number is automorphic or not.
            while (num != 0) {
                if (num % 10 != sq % 10) {
                    isAutomorphic = false;
                    break;
                }
                else {
                    num = num / 10;
                    sq = sq / 10;
                }
            }
            // Print the result.
            if (isAutomorphic) {
                System.out.println("The number is an Automorphic number.");
            }
            else {
                System.out.println("The number is not an Automorphic number.");
            }
        }
    }
}