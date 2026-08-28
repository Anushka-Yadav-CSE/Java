// A program to display whether the angles make an acute-angled triangle, a right-angled triangle or an obtuse angled triangle as per the user's choice.
import java.util.*;
public class Triangle3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the first angle: ");
            double angle1 = in.nextDouble();
            System.out.print("Enter the second angle: ");
            double angle2 = in.nextDouble();
            System.out.print("Enter the third angle: ");
            double angle3 = in.nextDouble();
            if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3) == 180) {
                System.out.println("Enter 1 to check for acute-angled triangle.");
                System.out.println("Enter 2 to check for right-angled triangle.");
                System.out.println("Enter 3 to check for obtuse-angled triangle.");
                System.out.print("Enter your choice: ");
                int choice = in.nextInt();
                // Switch case
                switch(choice) {                    
                    case 1 -> {
                        if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                            System.out.println("The triangle is an acute-angled triangle.");
                        }
                        else {
                            System.out.println("The triangle is not an acute-angled triangle.");
                        }
                    }
                    case 2 -> {
                        if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                            System.out.println("The triangle is a right-angled triangle.");
                        }
                        else {
                            System.out.println("The triangle is not a right-angled triangle.");
                        }
                    }
                    case 3 -> {
                        if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                            System.out.println("The triangle is an obtuse-angled triangle.");
                        }
                        else {
                            System.out.println("The triangle is not an obtuse-angled triangle.");
                        }
                    }
                    default -> {
                        System.out.println("Wrong Choice.");
                    }
                }
            }
            else {
                System.out.println("Invalid Input! Triangle is not possible.");
            }
        }
    }
}