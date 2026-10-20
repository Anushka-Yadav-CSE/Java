// A program to accept a sentence in mixed case and display each word with its vowel frequency.
import java.util.*;
public class Frequency1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            char word;
            String st = "";
            int f = 0;

            System.out.println("Enter a line: ");
            String line = in.nextLine();
            int l = line.length();

            System.out.println("Words with their frequencies are: ");

            for (int i = 0; i < l; i++) {
                word = line.charAt(i);

                if (word == ' ') {
                    if (!st.isEmpty()) {
                        System.out.println(st + " " + f);
                        st = "";
                        f = 0;
                    }
                } else {
                    st = st + word;

                    if (word == 'a' || word == 'e' || word == 'i' ||
                        word == 'o' || word == 'u' || word == 'A' ||
                        word == 'E' || word == 'I' || word == 'O' ||
                        word == 'U') {
                        f = f + 1;
                    }
                }
            }

            if (!st.isEmpty()) {
                System.out.println(st + " " + f);
            }
        }
    }
}
