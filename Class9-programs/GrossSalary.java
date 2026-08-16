// A program to compute and display gross salary.
import java.util.*;
public class GrossSalary {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the name of the employee: ");
            String name = in.nextLine();
            System.out.print("Enter the basic salary of the employee: ");
            double basic = in.nextDouble();
            // Output
            System.out.println("Name: " + name);
            System.out.println("Basic salary: " + basic);
            // Condition
            if (basic > 0) {
                if (basic <= 10000) {
                    // Calculation
                    double da = basic * 10.0 / 100.0;
                    double sa = basic * 5.0 / 100.0;
                    double salary = basic + da + sa;
                    // Output
                    System.out.println("DA: " + da);
                    System.out.println("SA: " + sa);
                    System.out.println("Gross Salary: " + salary);
                }
                else if (basic <= 20000) {
                    // Calculation
                    double da = basic * 12.0 / 100.0;
                    double sa = basic * 8.0 / 100.0;
                    double salary = basic + da + sa;
                    // Output
                    System.out.println("DA: " + da);
                    System.out.println("SA: " + sa);
                    System.out.println("Gross Salary: " + salary);
                }
                else if (basic <= 30000) {
                    // Calculation
                    double da = basic * 15.0 / 100.0;
                    double sa = basic * 10.0 / 100.0;
                    double salary = basic + da + sa;
                    // Output
                    System.out.println("DA: " + da);
                    System.out.println("SA: " + sa);
                    System.out.println("Gross Salary: " + salary);
                }
                else {
                    // Calculation
                    double da = basic * 20.0 / 100.0;
                    double sa = basic * 12.0 / 100.0;
                    double salary = basic + da + sa;
                    // Output
                    System.out.println("DA: " + da);
                    System.out.println("SA: " + sa);
                    System.out.println("Gross Salary: " + salary);
                }
            }
            else {
                System.out.println("Invalid Input! basic must be greater than zero.");
            }
        }
    }
}