// A program to calculate discounts(two successive discounts)
import java.util.*;
public class Discount {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the cost price: ");
            double cp=in.nextDouble();
            System.out.print("Enter the 1st rate of discount: ");
            double rated1=in.nextDouble();
            System.out.print("Enter the 2nd rate of discount: ");
            double rated2=in.nextDouble();
            double d1=cp*rated1/100.0;
            double d2=(cp-d1)*rated2/100.0;
            double discount=d1+d2;
            double sp=cp-discount;
            System.out.println("The cost price is " + cp);
            System.out.println("1st rate of discount is " + rated1);
            System.out.println("2nd rate of discount is " + rated2);
            System.out.println("The Discount is " + discount);
            System.out.println("The selling price is " + sp);
        } 
    }
}