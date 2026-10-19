// A program to display only numeric tokens present in a line.
import java.util.*;
public class NumToken {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a line ending with .: ");

            while (in.hasNext()) {
                if (in.hasNextInt()) {
                    System.out.print(in.nextInt() + " ");
                } else {
                    String st = in.next();
                    if (st.equals(".")) {
                        break;
                    }
                }
            }
        }
    }
}
