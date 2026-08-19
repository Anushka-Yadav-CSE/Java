// A program to input a number and display all its digits and state whether they are odd or even.
import java.util.*;
public class Digits3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {                        
            // Input
            System.out.println("Enter the number: ");
            int n = in.nextInt();
            System.out.println("The digits of the number are: ");
            // Do-while Loop
            do 
            {                                
                // Calculation                                
                int a = n % 10;                                
                // Output                
                System.out.println(a);                
                // Condition                
                if (a % 2 == 0) {                    
                    // Output
                    System.out.println("The digit is even."); 
                }               
                else {                     
                    // Output
                    System.out.println("The digit is odd.");
                }   
                // Calculation             
                n = n / 10;
            }
            while (n > 0);
        }
    }
}