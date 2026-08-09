// To input a number and perform some mathematical functions on it and display them.
import java.util.*;
public class MathFunctions {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            double number = in.nextDouble();
            if (number > 0) {
                // Calculation
                double pow = Math.pow(number,6);
                double cbrt = Math.cbrt(number);
                double round = Math.round(number);
                double rint = Math.rint(number);
                double ceil = Math.ceil(number);
                double floor = Math.floor(number);
                double log = Math.log(number);
                double abs = Math.abs(number);
                double cube = number * number * number;
                double sqrt = Math.sqrt(number);
                double random = Math.random();
                // Output
                System.out.println(" 6th power of the number: " + pow);
                System.out.println("Cube root of the number: " + cbrt);
                System.out.println("Round-off value of the number: " + round);
                System.out.println("Rint value of the number: " + rint);
                System.out.println("Ceil value of the number: " + ceil);
                System.out.println("Floor value of the number: " + floor);
                System.out.println("Logarithm of the number: " + log);
                System.out.println("Absolute value of the number: " + abs);
                System.out.println("Cube of the number: " + cube);
                System.out.println("Square root of the number: " + sqrt);
                System.out.println("Random number between zero (0) and one (1): " + random);
            }
            else {
                System.out.println("Invalid Input! Number must be greater than zero.");
            }
        }
    }
}