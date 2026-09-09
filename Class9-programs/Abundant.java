// A program to display abundant numbers from 10 to 100.
public class Abundant {
    public static void main(String[] args) {
        System.out.println("Abundant numbers are: ");
        // for loop to check and display abundant numbers from 10 to 100.
        for (int i = 10; i <= 100; i++) {
            int sum = 0;
            // for loop to find the sum of the proper factors of the number.
            for (int n = 1; n < i; n++) {
                if (i % n == 0) {
                sum = sum + n;
                }
            }
            // Condition to check whether the number is an abundant number or not.
            if (sum > i) {
                System.out.println(i);
            }
        }
    }
}