// A program to convert Fahrenheit temperature into Celsius.
// Enter a non-numeric value to terminate the program.
import java.util.*;
public class Temp {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a non-numeric value to terminate the program.");

            while (true) {
                System.out.print("Enter the temperature in Fahrenheit: ");

                if (in.hasNextDouble()) {
                    double tempF = in.nextDouble();
                    double tempC = (5.0 / 9.0) * (tempF - 32);

                    System.out.println("Temperature in Celsius = " + tempC);
                } else {
                    System.out.println("Program terminated.");
                    break;
                }
            }
        }
    }
}
