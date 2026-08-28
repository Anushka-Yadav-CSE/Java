// A program to convert the temperature into degree celsius and display it.
import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the temperature(in F):");
            double fahrenheit=in.nextDouble();
            double celsius=(5.0*(fahrenheit-32))/9.0;
            System.out.println("The temperature in Fahrenheit: " + fahrenheit + "F");
            System.out.println("The temperature in Celsius: " + celsius + "C");
        }
    }
}