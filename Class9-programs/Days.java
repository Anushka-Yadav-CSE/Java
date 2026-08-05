// A program to express days into years, months and days.
import java.util.*;
public class Days {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the no. of days: ");
            int days=in.nextInt();
            int years=days/365;
            int a=days%365;
            int months=a/30;
            days=a%30;
            System.out.println("The no. of years= " + years);
            System.out.println("The no. of months= " + months);
            System.out.println("The no. of days= " + days);
        }
    }
}