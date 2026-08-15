// A program to display name, age and taxable income of a person.
import java.util.*;
public class Income {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the name of the person: ");
            String name = in.nextLine();
            System.out.print("Enter the age of the person: ");
            int age = in.nextInt();
            System.out.print("Enter the income of the person: ");
            double income = in.nextDouble();
            // Output
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            // Condition
            if (age > 18 && age < 60) {
                if (income > 0) {
                    if (income <= 250000) {
                        // Calculation
                        double tax = 0.0;
                        double taxableIncome = income + tax;
                        // Output
                        System.out.println("Taxable Income: " + taxableIncome); 
                    }                    
                    else if (income > 250000 && income <= 500000) {
                        // Calculation
                        double tax = (income - 160000) * 10 / 100.0;
                        double taxableIncome = income - tax;
                        // Output
                        System.out.println("Taxable Income: " + taxableIncome); 
                    }               
                    else if (income > 500000 && income <= 1000000) {
                        // Calculation
                        double tax = (income - 500000) * 20 / 100.0 + 34000;
                        double taxableIncome = income - tax;
                        // Output
                        System.out.println("Taxable Income: " + taxableIncome);
                    }
                    else {
                        double tax = (income - 1000000) * 30 / 100.0 + 94000;
                        double taxableIncome = income - tax;
                        // Output
                        System.out.println("Txable Income: " + taxableIncome);
                    }
                }
                else {                     
                    // Output
                    System.out.println("Invalid Input! Income must be greater than zero.");
                }
            } 
            else {
                // Output
                System.out.println("Wrong Category!");
            }
        }
    }
}