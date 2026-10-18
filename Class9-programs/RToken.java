// A program to replace a token (RED) with another token (GREEN) in a string.
import java.util.*;
public class RToken {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            System.out.println("Enter line ending with a space and terminating with a (.): ");
            String st;
            while (true) { 
                st = in.next();
                if (st.equals("RED")) {
                    st = "GREEN";
                    System.out.print(st + " ");
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
