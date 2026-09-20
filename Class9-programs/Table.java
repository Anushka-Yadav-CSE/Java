// A program to print a mathematical table of the user's choice.
import java.util.*;
public class Table {
    public static void main(String[] args) {        
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number whose table you want: ");
            int n = in.nextInt();
            System.out.println("The table of " + n + " is:");
            for (int i = 1; i <= 10; i++) {
                int a = n * i;
                System.out.println(a);
            }
        }
    }
}