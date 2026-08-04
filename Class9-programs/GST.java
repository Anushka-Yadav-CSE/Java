// A program to calculate and display tax and amount paid by the customer.
import java.util.*;
public class GST {
    public static void main(String[] args) {
       try(Scanner in=new Scanner(System.in)){
        System.out.print("Enter the selling price of the article: ");
        double sp=in.nextDouble();
        System.out.print("Enter the rate of tax under GST: ");
        double rateoftax=in.nextDouble();
        double tax=sp*rateoftax/100.0;
        double amount=tax+sp;
        System.out.println("Selling price of good= " + sp);
        System.out.println("Rate of tax= " + rateoftax);
        System.out.println("Tax= " + tax);
        System.out.println("Total amount paid by the customer= " + amount);
       }
    }
}