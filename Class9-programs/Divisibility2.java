/* To check whether any 10 numbers are divisible by 5 or not and and if yes, then display all
 the numbers ending with the digit 5 and with 0. */
import java.util.*;
public class Divisibility2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int c = 0;
            // for loop to iterate 10 times to input the numbers.
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter the numbers: ");
                int num = in.nextInt();
                // Condition to check whether the number is divisible by 5 or not.
                if (num % 5 == 0) {
                    // Condition to check whether the number ends with digit 5 or 0 and displaying and counting accordingly.
                    if (num % 10 == 5) {
                        System.out.println("The number " + num + " is divisible by 5 and ends with digit 5.");
                    }
                    else if (num % 10 == 0) {
                        c = c + 1;
                        System.out.println("The number " + num + " is divisible by 5 and ends with digit 0.");
                    }
                }
                else {                        
                    System.out.println("This number is not divisible by 5.");
                } 
            }
            System.out.println("Count of numbers ending with 0 = " + c);
        }
    }
}