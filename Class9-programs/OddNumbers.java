/* A program to find and display all the odd numbers from 1 to 10 by using the continue in a 
 do-while loop.*/
public class OddNumbers {
    public static void main(String[] args) {
        int a = 0;
        // Output
        System.out.println("All odd numbers from 1 to 10 are: ");
        // do-while loop
        do {
            // Calculation
            a++;
            // Condition
            if (a % 2 == 0) {
                continue;
            }
            // Output
            System.out.println(a);            
            }
            while (a <= 9);
    }
}