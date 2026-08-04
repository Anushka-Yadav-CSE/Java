// To find the greatest of 3 numbers and display it.

import java.util.*;

public class GreatestNumber {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the 1st number: ");
            double firstnum = in.nextDouble();
            System.out.print("Enter the 2nd number: ");
            double secondnum = in.nextDouble();
            System.out.print("Enter the 3rd number: ");
            double thirdnum = in.nextDouble();
            double max = (firstnum > secondnum) ? (firstnum > thirdnum ? firstnum : thirdnum) : (secondnum > thirdnum ? secondnum : thirdnum);
            System.out.println("The greatest number is " + max);
        }
    }
}
