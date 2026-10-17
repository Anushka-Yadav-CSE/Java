// A program to display each token of the input on a separate line.
import java.util.*;
public class TDisplay {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter line ending with a space and terminating with a full stop(.): ");
            String st;
            while (true) {
                st = in.next();
                if (st.equals(".")) {
                    break;
                }
                System.out.println(st);
            }
        }
    }
}
