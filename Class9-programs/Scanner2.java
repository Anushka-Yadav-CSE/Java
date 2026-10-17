// A program to use the delimiters other than whitespaces.
import java.util.*;
public class Scanner2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in).useDelimiter("\\s*,\\s*")) {
            int a;
            double d;
            String word, line;
            System.out.println("Enter integer value, double value and a line: ");
            a = in.nextInt();
            d = in.nextDouble();
            word = in.next();
            line = in.nextLine().replaceFirst(",","");
            System.out.println("The tokens of the string are: ");
            System.out.println(a);
            System.out.println(d);
            System.out.println(word);
            System.out.println(line);
        }
    }
}
