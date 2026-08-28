// To input 2 numbers and calculate their sum and display them.
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the 1st number: ");
            double firstnum=in.nextDouble();
            System.out.print("Enter the 2nd number: ");
            double secondnum=in.nextDouble();
            double sum=firstnum+secondnum;
            System.out.println("The sum of both numbers is: " + sum);
        }
    }
} 