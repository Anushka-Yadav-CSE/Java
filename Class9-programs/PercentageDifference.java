// A program to find and display the percentage difference.
import java.util.*;
public class PercentageDifference {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the new value: ");
            double newvalue=in.nextDouble();
            System.out.print("Enter the old value: ");
            double oldvalue=in.nextDouble();
            float percentdiff=(float)(((newvalue-oldvalue)/oldvalue)*100.0);
            if(percentdiff<0) {
                System.out.println("Percentage is decreased by " + Math.abs(percentdiff) + "%");
            }
            else {
                System.out.println("Percentage is increased by " + percentdiff + "%");
            }
            }
        }
    }