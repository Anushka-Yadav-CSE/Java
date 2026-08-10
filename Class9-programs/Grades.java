// A program to calculate and display the average of marks and grades awarded.
import java.util.*;
public class Grades {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the student's name: ");
            String name = in.nextLine();
            System.out.print("Enter the marks in physics: ");
            double physics = in.nextDouble();
            System.out.print("Enter the marks in chemistry: ");
            double chemistry = in.nextDouble();
            System.out.print("Enter the marks in biology: ");
            double biology = in.nextDouble();
            System.out.print("Enter the marks in mathematics: ");
            double maths = in.nextDouble();
            // Calculation
            double average = (physics + chemistry + biology + maths) / 4.0;
            // Output
            System.out.println("Name of the student is " + name);
            System.out.println("Average is " + average);
            // Condition
            if (physics >= 0 && physics <= 100 && chemistry >= 0 && chemistry <= 100 && maths >= 0 && maths <= 100 && biology >= 0 && biology <= 100) {
                // Condition
                if (average >= 80) {
                    // Output
                    System.out.println("Grade awarded is \"Distinction\". ");
                }
                else if (average >= 60 && average < 80) {
                    // Output
                    System.out.println("Grade awarded is \"First Division\". ");
                }
                else if (average >= 45 && average < 60) {
                    // Output
                    System.out.println("Grade awarded is \"Second Division\". ");
                }    
                else if (average >= 40 && average < 45) {
                    // Output
                    System.out.println("Grade awarded is \"Pass\". ");
                }
                else {
                    // Output
                    System.out.println("Promotion not granted! ");
                }
            }
            else {
                System.out.println("INVALID INPUT! Marks must be greater than zero and less than 100.");
            }
        }
    }
}