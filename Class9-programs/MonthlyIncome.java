// A program to calculate and display the monthly income of a person.
import java.util.*;
public class MonthlyIncome {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the income of the person(per day): ");
            double income=in.nextDouble();
            System.out.print("Enter the fine(per day) for being absent: ");
            double fine=in.nextDouble();
            System.out.print("Enter the number of days he is present: ");
            int presentdays=in.nextInt();
            System.out.print("Enter the number of days he is absent: ");
            int absentdays=in.nextInt();
            double monthlyincome=(income*presentdays)-(fine*absentdays);
            System.out.println("Income of the person(per day): " + income);
            System.out.println("Fine(per day) for being absent: " + fine);
            System.out.println("No. of days he is present: " + presentdays);
            System.out.println("No. of days he is absent: " + absentdays);
            System.out.println("Monthly Income: " + monthlyincome);      
        }
    }
}