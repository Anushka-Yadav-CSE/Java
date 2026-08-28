// A program to calculate the sum and average of 3 variables and display it using function argument.
import java.util.*;
public class SumAverage {
    public static void cal(double a, double b,double c) {
        double sum=a+b+c;
        double avg=sum/3.0;
        System.out.println("The sum = " + sum);
        System.out.println("The average = " + avg);
    }
    //Function argument
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the value of 1st variable: ");
            double a=in.nextDouble();
            System.out.print("Enter the value of 2nd variable: ");
            double b=in.nextDouble();
            System.out.print("Enter the value of 3rd variable: ");
            double c=in.nextDouble();
            cal(a,b,c);
        }
    }
}