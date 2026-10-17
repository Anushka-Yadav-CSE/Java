// A program to count the frequency of a token (the) in a string.
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter line ending with a space and terminating with (.): ");
            String st;
            int c = 0;
            while (true) { 
                st = in.next();
                if (st.equals("the")) {
                    c = c + 1;
                }
                if (st.equals(".")) {
                    break;
                }
            }
            System.out.println("Frequency of the token 'the' = " + c);  
        }
    }
}
