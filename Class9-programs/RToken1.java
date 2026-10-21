// A program to remove the token "THE" from a line ending with a separate full stop.
import java.util.*;
public class RToken1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            System.out.println("Enter a line: ");
            String st;
            while (true) {    
                st = in.next();
                if (st.equals("THE")) {
                    continue;
                }
                System.out.print(st + " ");
                if (st.equals(".")) {
                    break;
                }
            }
        }
    }
}
