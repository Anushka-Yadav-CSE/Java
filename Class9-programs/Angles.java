// A program to check whether angles are "Complementary Angles" or "Supplementary Angles".
import java.util.*;
public class Angles {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the first angle: ");
            double angle1 = in.nextDouble();
            System.out.print("Enter the second angle: ");
            double angle2 = in.nextDouble();
            // Calculation
            double sum = angle1 + angle2;
            // Input
            System.out.println("Enter 1 for complementary, 2 for supplementary: ");
            System.out.print("Enter the user's choice: ");
            int choice = in.nextInt();
            // Switch case
            switch(choice)
            {
                case 1:
                    // Condition
                    if (sum == 90)
                        // Output                        
                        System.out.println("Complementary Angles.");                    
                    else
                        // Output   
                        System.out.println("Not Complementary Angles.");
                    break;
                case 2:
                    // Condition                   
                    if (sum == 180) 
                        // Output   
                        System.out.println("Supplementary Angles.");
                    else 
                        // Output   
                        System.out.println("Not Supplementary Angles.");
                    break;
                default:
                    // Output   
                    System.out.println("Wrong Choice.");
            }
        }
    }
}