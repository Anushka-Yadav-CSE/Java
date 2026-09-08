// A program to input any 10 natural numbers and display all the possible factors for each number.
import java.util.*;
public class Factor1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // for loop to enter 10 natural numbers.
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter a natural number: ");
                int num = in.nextInt();
                System.out.println("Factors are: ");
                // for loop to check and display the factors of the number.
                for(int a = 1; a <= num; a++) {
                    if (num % a == 0) {
                        System.out.print(a + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}