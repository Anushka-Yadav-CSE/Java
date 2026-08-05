// A program to display the net salary and gross salary and the employee's name.
import java.util.*;
public class Esalary {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            // Input
            System.out.print("Enter the name of the employee: ");
            String name=in.nextLine();
            System.out.print("Enter the basic salary: ");
            double basicsalary=in.nextDouble();
            // Calculation
            double da=(30/100.0)*basicsalary;
            double hra=(12.5/100.0)*basicsalary;
            double pf=(10/100.0)*basicsalary;
            double gross=basicsalary + da + hra;
            double netsalary= gross - pf;
            // Output
            System.out.println("The employee's name is " + name);
            System.out.println("The basic salary is " + basicsalary);
            System.out.println("The gross salary is " + gross);
            System.out.println("The net salary is " + netsalary);
        }
    }
}