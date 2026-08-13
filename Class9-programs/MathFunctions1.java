// A program to calculate mathematical functions.
import java.util.*;
public class MathFunctions1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            double number = in.nextDouble();
            System.out.println("Enter 1 to find natural logarithm.");
            System.out.println("Enter 2 to find absolute value.");
            System.out.println("Enter 3 to find square root.");
            System.out.println("Enter 4 to find cube root.");
            System.out.println("Enter 5 to find random numbers between 0 and 1.");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Switch case
            switch(choice) {
                case 1 -> {
                    if (number > 0) {
                        double log = Math.log(number);
                        System.out.println("Natural Logarithm of the number is " + log);
                    }
                    else {
                        System.out.println("Invalid Input! Number must be greater than zero to perform this function.");
                    }
                }
                case 2 -> {
                    double absolute = Math.abs(number);
                    System.out.println("Absolute value of the number is " + absolute);
                }
                case 3 -> {
                    if (number >= 0) { 
                        double sqrt = Math.sqrt(number);
                        System.out.println("Square root of the number is " + sqrt);                    
                    } 
                    else {
                        System.out.println("Invalid Input! Number must be greater or equal to zero to perform this function.");
                    }
                }
                case 4 -> {                    
                    double cbrt = Math.cbrt(number);
                    System.out.println("Cube root of the number is " + cbrt);                
                }
                case 5 -> {
                    double random = Math.random();
                    System.out.println("Random number between 0 and 1 is " + random);
                }
                default -> {
                    System.out.println("Wrong Choice.");
                }
            }
        }
    }
}