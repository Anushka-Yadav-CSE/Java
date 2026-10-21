// A program to input a line and replace some tokens and display the new line.
// Sample Input: 26 January is celebrated as the Republic Day of India .
// Sample Output: 15 August is celebrated as the Independence Day of India .
import java.util.*;
public class RToken2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            System.out.println("Enter a line ending with a whitespace and terminating with a (.): ");
            String st;
            while (true) {   
                st = in.next();
                if (st.equals("26")) {
                    st = "15";
                }
                if (st.equals("January")) {
                    st = "August";
                }
                if (st.equals("Republic")) {
                    st = "Independence";
                }
                System.out.print(st + " ");
                if(st.equals(".")) {
                    break;
                }
            }
        }
    }
}
