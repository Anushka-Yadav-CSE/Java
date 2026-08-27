// A program to find and display the simple interest and amount by using function argument.
import java.util.*;
public class SimpleInterest {
    public static void calculate(double principal, double interest, double time) {
        double si=(principal*interest*time)/100.0;
        double amount=principal+si;
        System.out.println("The Simple Interest is " + si);
        System.out.println("The Amount is " + amount);
    }
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the principal: ");
            double principal=in.nextDouble();
            System.out.print("Enter the interest: ");
            double interest=in.nextDouble();
            System.out.print("Enter the time: ");
            double time=in.nextDouble();
            calculate(principal, interest, time);
        }
    }
}