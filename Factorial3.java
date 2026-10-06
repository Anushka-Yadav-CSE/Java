// A program to input a number and display the factorial of each digit.
import java.util.*;
public class Factorial3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int b, f;
            System.out.println("Enter the number: ");
            int num = in.nextInt();
            int a = num;
            do { 
                f = 1;
                b = a % 10;
                for (int i = 1; i <= b; i++) {
                    f = f * i;
                }
                a = a / 10;
                System.out.println("Factorial of " + b + " is : " + f);
            }
            while (a != 0);
        }
    }
}