// A sample program to test the Scanner class.
import java.util.*;
public class Scanner1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a;
            double d;
            String word;
            String line;
            System.out.println("Enter integer value, double value and a line: ");
            a = in.nextInt();
            d = in.nextInt();
            word = in.next();
            line = in.nextLine();
            System.out.println("The output of the input data is shown as: ");
            System.out.println(a);
            System.out.println(d);
            System.out.println(word);
            System.out.println(line);
        }
    }
}
