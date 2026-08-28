// A program to change fahrenheit to celsius and vice versa as per the user's choice.
import java.util.*;
public class Temperature1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the temperature: ");
            double temp = in.nextDouble();
            System.out.println("Enter 1 to convert Celsius into Fahrenheit.");
            System.out.println("Enter 2 to convert Fahrenheit into Celsius.");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            // Switch case
            switch(choice) {
                case 1 -> {
                    // Calculation
                    double fahrenheit = 1.8 * temp + 32;
                    // Output
                    System.out.println("The temperature in fahrenheit: " + fahrenheit);
                }
                case 2 -> {
                    // Calculation
                    double celsius = 5.0 / 9.0 * (temp - 32);
                    // Output
                    System.out.println("The temperature in celsius: " + celsius);
                }
                default -> {
                    // Output
                    System.out.println("Wrong Choice.");
                }
            }
        }
    }
}