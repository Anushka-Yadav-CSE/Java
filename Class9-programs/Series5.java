// A program to display the series S = (1+2)/(1*2) + (1+2+3)/(1*2*3) + ........ n times
import java.util.*;
public class Series5 {
    public static void main(String[] args) {
        try(Scanner in = new  Scanner(System.in)) {
            double sum = 1.0;
            double sum1;
            double product = 1.0;
            double product1;
            double series = 0.0;
            // Prompt the user to enter a number.
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            // for loop to calculate the series.
            for (int i = 2; i <= num; i++) {
                sum1 = sum + i;
                product1 = product * i;
                series = series + (sum1 / product1);
                sum = sum1;
                product = product1; 
            }
            // Print the result.
            System.out.println("S = " + series);
        }
    }
}