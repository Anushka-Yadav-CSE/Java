// To calculate and display the average of three subjects.
import java.util.*;
public class Average {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the marks in physics: ");
            double physics = in.nextDouble();
            System.out.print("Enter the marks in chemistry: ");
            double chemistry = in.nextDouble();
            System.out.print("Enter the marks in mathematics: ");
            double maths = in.nextDouble();
            // Condition
            if (physics >= 0 && chemistry >= 0 && maths >=0) {
                // Calculation
                double avg = (physics + chemistry + maths) / 3.0;
                double round = Math.round(avg);
                // Output
                System.out.println("Marks obtained in physics: " + physics);
                System.out.println("Marks obtained in chemistry: " + chemistry);
                System.out.println("Marks obtained in mathematics: " + maths);
                System.out.println("Average marks: " + avg);
                System.out.println("Average marks after being rounded off: " + round);
            }
            else {
                System.out.println("Invalid Input! Marks cannot be less than zero.");
            }
        }
    }
}