// A program to display the sum of all the odd and even numbers between a range of numbers m and n(m <n).
import java.util.*;
public class Sum5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // initialising the variables for sum of odd and even numbers.
            int sumeven = 0;
            int sumodd = 0;
            // Taking the upper limit and lower limit.
            System.out.print("Enter the upper limit: ");
            int n = in.nextInt();
            System.out.print("Enter the lower limit: ");
            int m = in.nextInt();
            // Condition to check whether the m < n and then calculating the sum of odd and even numbers between m and n.
            if(m < n) {
                for(int i = m; i < n; i++) {
                    if(i % 2 == 0) {
                        sumeven = sumeven + i;
                    }
                    else {
                        sumodd = sumodd + i;
                    }
                }
                System.out.println("Sum of all even numbers between " + m + " and" + n + " =" + sumeven);
                System.out.println("Sum of all odd numbers between " + m + " and" + n + " =" + sumodd);
            }
            else {
                System.out.println("The upper limit should be greater than the lower limit.");
            }
        }
    }
}