// A program to calculate and display the amount spent on provident fund and education and rent and remaining salary.
import java.util.*;
public class Fund {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the salary: ");
            double salary=in.nextDouble();
            System.out.print("Enter the percentage of salary spent on provident fund: ");
            double percentprovidentfund=in.nextDouble();
            System.out.print("Enter the percentage of salary spent on house rent: ");
            double percenthouserent=in.nextDouble();
            System.out.print("Enter the percentage of salary spent on education of children: ");
            double percenteducation=in.nextDouble();
            double providentfund=salary*percentprovidentfund/100.0;
            double houserent=(salary-providentfund)*percenthouserent/100.0;
            double education=(salary-providentfund-houserent)*percenteducation/100.0;
            double remsalary=salary-providentfund-houserent-education;
            System.out.println("The amount deducted as provident fund: " + providentfund);
            System.out.println("The amount spent on house rent: " + houserent);
            System.out.println("The amount spent on education of children: " + education);
            System.out.println("The remaining salary left: " + remsalary);
        }
    }
} 