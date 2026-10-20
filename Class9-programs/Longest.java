// A program to display the longest word along with its number of characters.
import java.util.*;

public class Longest {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a line: ");
            String st = in.nextLine();
            int l = st.length();

            char word;
            int m;
            int max = 0;
            String st1 = "";
            String longest = "";

            for (int i = 0; i < l; i++) {
                word = st.charAt(i);

                if (word == ' ') {
                    m = st1.length();

                    if (m > max) {
                        max = m;
                        longest = st1;
                    }

                    st1 = "";
                } else {
                    st1 = st1 + word;
                }
            }

            m = st1.length();

            if (m > max) {
                max = m;
                longest = st1;
            }

            System.out.println("Longest word = " + longest);
            System.out.println("Number of characters = " + max);
        }
    }
}
