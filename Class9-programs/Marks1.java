// A program to calculate and display the number of students who got 95% and above in the exam.
import java.util.*;
public class Marks1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double marksA, marksB, marksC, marksD;
            int k = 0, l = 0, m = 0, n = 0;
            // Taking percentage marks of students from section A and checking if the marks are 95% or above.
            for (int i = 1; i <= 40; i++) {
                System.out.print("Enter the percentage marks: ");
                marksA = in.nextDouble();
                if (marksA >= 95) {
                    k++;
                }
            }
            // Taking percentage marks of students from section B and checking if the marks are 95% or above.
            for (int i = 1; i <= 40; i++) {
                System.out.print("Enter the percentage marks: ");
                marksB = in.nextDouble();
                if (marksB >= 95) {
                    l++;
                }
            }
            // Taking percentage marks of students from section C and checking if the marks are 95% or above.
            for (int i = 1; i <= 40; i++) {
                System.out.print("Enter the percentage marks: ");
                marksC = in.nextDouble();
                if (marksC >= 95) {
                    m++;
                }
            }
            // Taking percentage marks of students from section D and checking if the marks are 95% or above.
            for (int i = 1; i <= 40; i++) {
                System.out.print("Enter the percentage marks: ");
                marksD = in.nextDouble();
                if (marksD >= 95) {
                    n++;
                }
            }
            // Printing the result.
            System.out.println("Number of students who got 95% or above in section A: " + k);
            System.out.println("Number of students who got 95% or above in section B: " + l);
            System.out.println("Number of students who got 95% or above in section C: " + m);
            System.out.println("Number of students who got 95% or above in section D: " + n);
        }
    }
}