// A program to display the first 10 numbers of the fibonacci series.
public class Fibonacci {
    public static void main(String[] args) {
        // Input
        int a = 0; 
        int b = 1;
        int n = 0; 
        // Output
        System.out.println("The fibonacci series is ");
        System.out.print(a + " , ");
        System.out.print(b + " , ");
        // do-while loop
        do {
            // Calculation
            int c = a + b;
            // Output
            System.out.print(c + " , ");
            // Calculation
            a = b;
            b = c;
            n = n + 1;
        }
        while (n <= 7);    
    }
}