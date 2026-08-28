// A program to find and display the percentage of boys and girls.
import java.util.*;
public class Students {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int students=in.nextInt();
            System.out.print("Enter the number of girls: ");
            int girls=in.nextInt();
            int boys= students-girls;
            double percentgirls=(double)girls/students*100.0;
            double percentboys=(double)boys/students*100.0;
            System.out.println("The percentage of boys in the class: " + percentboys);
            System.out.println("The percentage of girls in the class: " + percentgirls);
        }
    }
}