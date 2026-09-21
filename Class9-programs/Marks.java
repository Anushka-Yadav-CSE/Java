// A program to calculate and display average marks obtained by all the students.
import java.util.*;
public class Marks {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double total = 0.0;
            // Prompt the user to enter the number of students.
            System.out.print("Enter the number of students: ");
            int students = in.nextInt();
            // Condition to check whether the number of students are greater than 0.
            if (students > 0) {
                // loop to calculate the average marks obtained by all the students.
                for (int i = 1; i <= students; i++) {
                    System.out.print("Enter the marks obtained in maths: ");
                    double maths = in.nextDouble();
                    System.out.print("Enter the marks obtained in Science: ");
                    double science = in.nextDouble();
                    System.out.print("Enter the marks obtained in English: ");
                    double english = in.nextDouble();
                    total = total + (maths + science + english);
                }
                double avg = total / (students * 3);
                // Printing the result.
                System.out.println("Average marks obtained by all the students = " + avg);
            }
            // Condition to handle invalid input.
            else {
                System.out.println("Invalid Input! Number of students must be greater than 0.");
            }
        }
    }
}